package com.zhiku.resumeapp.controller;

import com.zhiku.resumeapp.common.R;
import com.zhiku.resumeapp.entity.Cv;
import com.zhiku.resumeapp.service.CvService;
import com.zhiku.resumeapp.service.MemberService;
import com.zhiku.resumeapp.service.RecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cv")
public class CvController {
    @Autowired
    private CvService cvService;

    @GetMapping
    public R publicCv(){
        List<Cv> cvList = cvService.findPublicCv();
        return R.success().setRows(cvList);
    }

    @GetMapping("/search")
    public R searchCv(@RequestParam("key")String keywords){
        List<Cv> cvList = cvService.searchCv(keywords);
        return R.success().setRows(cvList);
    }

    @GetMapping("/{id}")
    public R findById(@PathVariable("id")int id){
        Cv cv = cvService.findById(id);
        return R.success().setData(cv);
    }

    @PutMapping("/base")
    public R editBase(@RequestBody Cv cv){
        cvService.editBase(cv);
        return R.success();
    }

    @PutMapping("/desired")
    public R editDesired(@RequestBody Cv cv){
        cvService.editDesired(cv);
        return R.success();
    }

    @PutMapping("/status")
    public R updateStatus(@RequestBody Cv cv){
        cvService.updateStatus(cv);
        return R.success();
    }

}
