package com.zhy.pattern;

/**
 * @ClassName: JavaTest
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/6/13 14:37
 * @Version: 1.0
 **/
public class JavaTest {
    public static void main(String[] args) {
        int a = 6; // 00000110
        int b = 11;// 00001011

        System.out.println(a & b); //00000010 只要同时为1的时候才为1

        System.out.println(a | b); //00001111 只有一个有1就是1

        System.out.println(a^b); //00001101 不同取1 相同取0

        System.out.println(~a);//11111001 取反

        System.out.println(a<<2);//*4

        System.out.println(b>>2);// /4

        System.out.println(b >>> 3); //


    }
}
