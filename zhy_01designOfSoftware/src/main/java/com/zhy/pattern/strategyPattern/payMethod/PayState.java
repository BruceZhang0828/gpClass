package com.zhy.pattern.strategyPattern.payMethod;

/**
 * @ClassName: PayState
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/5/28 17:50
 * @Version: 1.0
 **/
public class PayState {
    private int code;
    private Object data;
    private String msg;

    public PayState(int code,String msg,Object o){
        this.code = code;
        this.data = o;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return ("支付状态:["+code+"],"+msg+",交易详情:"+data);
    }
}
