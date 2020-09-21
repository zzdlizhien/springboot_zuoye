package com.zzd.boot.utils;

public class JsonData {
    private Integer code;
    private String msg;
    private Object data;

    public JsonData() {
        super();
    }

    public JsonData(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static JsonData buildSuccess(String msg){
        return new JsonData(200,msg,null);
    }

    public static JsonData buildSuccess(Object data){
        return new JsonData(200,"success...",data);
    }

    public static JsonData buildSuccess(String msg,Object data){
        return new JsonData(200,msg,data);
    }

    public static JsonData buildError(String msg){
        return new JsonData(-1,msg,null);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "JsonData{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
