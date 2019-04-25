package com.zhy.pattern.prototypePattern.deepClone;

import java.io.Serializable;

/**
 * @ClassName: JinGuBang
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/4/24 11:34
 * @Version: 1.0
 **/
public class JinGuBang implements Serializable {

    private float h  = 100;

    private float d = 10;

    public void bigger(){
        this.h *=2;
        this.d *=2;
    }

    public void smaller(){
        this.h/=2;
        this.d/=2;
    }
}
