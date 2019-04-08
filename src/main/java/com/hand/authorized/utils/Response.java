package com.hand.authorized.utils;

/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-2:56 PM
 */
public class Response {
    private String code;
    private String message;
    private Object data;

    public String getCode() {
        return code;
    }

    public Response setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Response setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public Response setData(Object data) {
        this.data = data;
        return this;
    }
}
