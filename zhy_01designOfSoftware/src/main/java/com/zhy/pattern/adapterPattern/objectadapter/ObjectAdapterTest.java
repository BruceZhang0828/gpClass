package com.zhy.pattern.adapterPattern.objectadapter;

/**
 * @ClassName: ObjectAdapterTest
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/6/10 15:54
 * @Version: 1.0
 **/
public class ObjectAdapterTest {

    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outputDC5V();
    }
}
