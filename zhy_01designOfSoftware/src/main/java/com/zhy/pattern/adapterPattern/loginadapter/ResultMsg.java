package com.zhy.pattern.adapterPattern.loginadapter;

/**
 * @ClassName: ResultMsg
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/6/10 16:04
 * @Version: 1.0
 **/
public class ResultMsg {
    private int code;
    private String msg;
    private Object data;

    public ResultMsg(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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
}
