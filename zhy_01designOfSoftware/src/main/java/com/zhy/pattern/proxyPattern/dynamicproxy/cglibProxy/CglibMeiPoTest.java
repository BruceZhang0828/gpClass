package com.zhy.pattern.proxyPattern.dynamicproxy.cglibProxy;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @ClassName: CglibMeiPoTest
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/5/18 17:55
 * @Version: 1.0
 **/
public class CglibMeiPoTest {
    public static void main(String[] args) {
        try {

            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"E://workspace/");

            Customer customer = (Customer)new CglibMeipo().getInstance(Customer.class);

            customer.findLove();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
