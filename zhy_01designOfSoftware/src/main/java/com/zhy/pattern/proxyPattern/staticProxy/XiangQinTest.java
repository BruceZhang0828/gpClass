package com.zhy.pattern.proxyPattern.staticProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: XiangQinTest
 * @Description: 测试
 * @auther: zhy
 * @Date: 2019/4/26 18:27
 * @Version: 1.0
 **/
public class XiangQinTest {

    /*public static void main(String[] args) {
        Father father = new Father();
        father.findLove();
    }*/


    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("a");
        lists.add("b");
        lists.add("c");
        lists.add("d");
        lists.add("e");
        lists.add("f");
        lists.remove("a");

        lists.stream().forEach( s ->{
            System.out.println(s);
        });
    }
}
