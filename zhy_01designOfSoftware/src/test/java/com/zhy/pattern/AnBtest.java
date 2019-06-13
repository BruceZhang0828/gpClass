package com.zhy.pattern;

/**
 * @ClassName: AnBtest
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/6/13 11:33
 * @Version: 1.0
 **/
public class AnBtest {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        a = a^b;
        b = b^a;
        a = a^b;
        System.out.println(a + " "+ b);
    }
}
