package com.zhy.pattern.adapterPattern.objectadapter;

/**
 * @ClassName: AC220
 * @Description: 适配器现实中对应插头的转换器
    交流电 220V
 * @auther: zhy
 * @Date: 2019/6/10 15:03
 * @Version: 1.0
 **/
public class AC220 {
    public int outputAC220V(){
        int output = 220;
        System.out.println("输出交流电"+output+"V");
        return output;
    }
}
