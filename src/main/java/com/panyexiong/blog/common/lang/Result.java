package com.panyexiong.blog.common.lang;

import lombok.Data;

@Data
public class Result {
    private Integer code;

    private String msg;

    private Object data;

    public static Result success(Object data){
        return success(200,"success", data);
    }

    public static Result success(Integer code, String msg, Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setData(data);
        result.setMsg(msg);
        return result;
    }


    public static Result fail(String msg) {
        return fail(400, msg, null);
    }

    public static Result fail(String msg, Object data) {
        return fail(400, msg, data);
    }

    public static Result fail(int code, String msg, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }


}
