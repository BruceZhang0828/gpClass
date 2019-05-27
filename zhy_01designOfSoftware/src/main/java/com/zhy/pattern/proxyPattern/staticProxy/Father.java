package com.zhy.pattern.proxyPattern.staticProxy;

/**
 * @ClassName: Father
 * @Description: 父亲类
 * @auther: zhy
 * @Date: 2019/4/26 18:24
 * @Version: 1.0
 **/
public class Father {
    private Son son;

    public Father(){
        son = new Son();
    }

    public void findLove(){
        System.out.println("父母物色对象");
        this.son.findLove();
        System.out.println("双方同意交往，确立关系");
    }
}
