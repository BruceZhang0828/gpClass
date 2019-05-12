package com.zhy.pattern.proxyPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Test
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/5/9 16:21
 * @Version: 1.0
 **/
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add(0, "f");
        System.out.println(list);
    }
}
