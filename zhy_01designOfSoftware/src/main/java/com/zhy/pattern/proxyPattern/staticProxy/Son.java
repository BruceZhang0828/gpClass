package com.zhy.pattern.proxyPattern.staticProxy;

/**
 * @ClassName: Son
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/4/26 18:19
 * @Version: 1.0
 **/
public class Son implements Person {
    @Override
    public void findLove() {
        System.out.println("要求 白富美");
    }
}
