package com.hand.authorized.utils;

/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-2:57 PM
 */
public class ResponseUtils {
    public static Response success(String message,Object data){
        return new Response().setCode("200").setMessage(message).setData(data);
    }

    public static Response success(){
        return new Response().setCode("200");
    }

    public static Response fail(String message,Object data){
        return new Response().setCode("500").setMessage(message).setData(data);
    }
    public static Response fail(){
        return new Response().setCode("500");
    }

    public static Response build(String code,String message,Object data){
        return new Response().setCode(code).setMessage(message).setCode(code).setData(data);
    }
}
