package com.zhy.pattern.proxyPattern.staticProxy;

/**
 * @ClassName: Order
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/4/26 18:34
 * @Version: 1.0
 **/
public class Order {
    private Object orderInfo;

    private Long creatTime;

    private String id;

    public Object getObject() {
        return orderInfo;
    }

    public void setObject(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Long getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Long creatTime) {
        this.creatTime = creatTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
