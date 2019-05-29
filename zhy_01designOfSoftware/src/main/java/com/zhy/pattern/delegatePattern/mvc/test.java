package com.zhy.pattern.delegatePattern.mvc;

/**
 * @ClassName: test
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/5/28 15:02
 * @Version: 1.0
 **/
public class test {
    public static void main(String[] args) {
        int a = 12;
        int b = 5;
        a = a^b;
        System.out.println(a +" "+b);
        b = a^b;
        System.out.println(a +" "+b);
        a = a^b;
        System.out.println("a = "+a+";b="+b);
    }
}
