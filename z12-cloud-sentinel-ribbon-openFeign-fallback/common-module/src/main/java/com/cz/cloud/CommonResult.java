package com.cz.cloud;

import lombok.Data;

/**
 * @author zhouchaoyu
 * @time 2023-11-12-15:54
 */
@Data
public class CommonResult<T> {
    int code;
    String message;

    private T data;
    public CommonResult() {
    }

    public CommonResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public CommonResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

}
