package com.example.wzb.paramDTO;

import lombok.Data;

@Data
public class Result<T> {
    private  Integer  code;
    private String message;
    private T data;

    public Result(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result() {
    }

    public static <T> Result<T> ok(T data){
        return new Result(200,"响应成功！",data);
    }

    public static <T> Result<T> fail(Integer code,String message){
        return new Result(code,message);
    }

}
