package com.dejing.bootlaunch.model;

import lombok.Data;

@Data
public class AjaxResponse
{
    private boolean isok;
    private int code;
    private String message;
    private Object data;
    private AjaxResponse()
    {

    }

    public static AjaxResponse success()
    {
        AjaxResponse result = new AjaxResponse();
        result.setIsok(true);
        result.setCode(200);
        result.setMessage("success");
        return  result;
    }
    public static AjaxResponse success(Object data)
    {
        AjaxResponse result = new AjaxResponse();
        result.setIsok(true);
        result.setCode(200);
        result.setMessage("success");
        result.setData(data);
        return  result;
    }
}