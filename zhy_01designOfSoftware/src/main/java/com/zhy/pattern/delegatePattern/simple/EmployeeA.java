package com.zhy.pattern.delegatePattern.simple;

/**
 * @ClassName: EmployeeA
 * @Description: 雇员A
 * @auther: zhy
 * @Date: 2019/5/28 14:23
 * @Version: 1.0
 **/
public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是一个雇员A我正做"+command+"工作");
    }
}
