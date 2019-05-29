package com.zhy.pattern.delegatePattern.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: Leader
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/5/28 14:27
 * @Version: 1.0
 **/
public class Leader implements IEmployee {

    Map<String,IEmployee> department = new HashMap<>();
    public Leader(){
        department.put("登录",new EmployeeA());
        department.put("加密",new EmployeeB());
    }
    @Override
    public void doing(String command) {
        department.get(command).doing(command);
    }
}
