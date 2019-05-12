package com.zhy.pattern.prototypePattern.simpleClone;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: StringTest
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/4/24 16:10
 * @Version: 1.0
 **/
public class StringTest {
    private List<String> list  = new ArrayList<String>();
    public StringTest(){
        list.add("新建文件夹.doc");
        list.add("新建文件夹(1).doc");
        list.add("新建文件夹(2).doc");
        list.add("新建文件夹(3).doc");
        list.add("新建文件夹(4).doc");
        list.add("新建文件夹(5).txt");
        list.add("新建文件夹2019.doc");
        list.add("新建文件夹2019(1).doc");
        list.add("新建文件夹2019(2).doc");
    }


    public static void main(String[] args) {
        StringTest stringTest = new StringTest();
        stringTest.add("新建文件夹2019.doc");
        System.out.println(stringTest.list);
    }


    private void add(String name){

        boolean contains = list.contains(name);
        if (contains){
            String[] split = name.split("\\.");
            int num = 1;
            String relex = "^"+split[0]+"\\("+"\\d"+"\\)."+split[1]+"$";
            for (String s:list){
                if (s.matches(relex)){
                    num++;
                }
            }
            if (num==1){
                list.add(name+"(1)");
            }else{
                list.add(name+"("+num+")");
            }
        }else{
            list.add(name);
        }
    }
}
