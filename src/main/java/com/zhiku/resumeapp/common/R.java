package com.zhiku.resumeapp.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class R <T>{
    /**
     * 单个数据对象
     */
    private T data;
    /**
     * 数据集合
     */
    private List<T> rows;
    /**
     * 响应码
     */
    private String code;
    /**
     * 响应信息
     */
    private String message;
    //枚举信息构造器
    public R(Code code){
        this.code=code.getValue();
        this.message=code.getMessage();
    }
    /**
     * 执行成功
     * @return
    3.5.3 响应测试
    修改TestCtrl的hello方法返回值
    在浏览器中访问：http://localhost:8080/test/hello
    3.5.4 异常返回修改
    全局异常返回的信息我们也统一返回格式。
    返回值修改为Response
    访问：http://localhost:8080/test/error 查看结果
     */
    public static R success(){
        return new R(Code.SUCCESS);
    }
    /**
     * 执行失败
     * @return
     */
    public static R failure(){
        return new R(Code.FAILURE);
    }
}
