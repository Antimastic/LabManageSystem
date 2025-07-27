package com.example.labmanagesystem.pojo;

import lombok.Data;

@Data
public class Result {
    private Integer code;
    private String msg;
    private Object data;

    public static Result success() {
        Result result = new Result();
        result.code = 200;
        result.msg = "操作成功";
        return result;
    }

    public static Result success(Object data) {
        Result result = success();
        result.data = data;
        return result;
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.code = code;
        result.msg = msg;
        return result;
    }

    public static Result toResult(boolean result, String msg) {
        return result ? success() : error(500, msg);
    }

    public static Result toResult(boolean result) {
        return toResult(result, "操作失败");
    }

    public static Result toResult(int result) {
        return toResult(result > 0);
    }
}
