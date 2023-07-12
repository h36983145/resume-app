package com.zhiku.resumeapp.controller;

import com.zhiku.resumeapp.common.R;
import com.zhiku.resumeapp.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class BaseController<T,S extends BaseService> {
    @Autowired(required = false)
    private S baseService;
    @GetMapping("/cv/{cvId}")
    public R findByCvId(@PathVariable("cvId") int cvId){
        List<T> list = baseService.findByCvId(cvId);
        return R.success().setRows(list);
    }
    @PostMapping
    public R insert(@RequestBody T entity){
        baseService.insert(entity);
        return R.success();
    }
    @PutMapping
    public R update(@RequestBody T entity){
        baseService.update(entity);
        return R.success();
    }
    @DeleteMapping("/{id}")
    public R delete(@PathVariable int id){
        baseService.deleteById(id);
        return R.success();
    }
}
