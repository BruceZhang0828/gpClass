package com.zhy.pattern.delegatePattern.simple;

/**
 * @ClassName: EmployeeB
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/5/28 14:25
 * @Version: 1.0
 **/
public class EmployeeB implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是雇员B我正在做"+command+"工作");
    }
}
