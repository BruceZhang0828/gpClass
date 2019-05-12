package com.zhy.pattern.proxyPattern.dynamicproxy.jdkproxy;

import com.zhy.pattern.proxyPattern.staticProxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;


public class MeipoTest {

    public static void main(String[] args) {
        try {
            Meipo meipo = new Meipo();
            Person instance = (Person)meipo.getInstance(new Girl());
            instance.findLove();
            byte[] proxyClass = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
            FileOutputStream fos = new FileOutputStream("E://$Proxy0.class");
            fos.write(proxyClass);
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
