package com.zhy.pattern.adapterPattern.objectadapter;

/**
 * @ClassName: PowerAdapter
 * @Description: 电源适配器 转化头
 * @auther: zhy
 * @Date: 2019/6/10 15:11
 * @Version: 1.0
 **/
public class PowerAdapter implements DC5 {
    //这里用到了 静态代理
    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }


    @Override
    public int outputDC5V() {
        int output220V = ac220.outputAC220V();
        int output5V = output220V/44;
        System.out.println("使用 PowerAdapter 输入 AC:"+output220V+"V"+"输出DC:"+output5V+"V");
        return output5V;
    }
}
