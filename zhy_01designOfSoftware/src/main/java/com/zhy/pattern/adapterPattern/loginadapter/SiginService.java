package com.zhy.pattern.adapterPattern.loginadapter;

import com.zhy.pattern.templatePattern.jdbc.entity.Member;

/**
 * @ClassName: SiginService
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/6/10 16:17
 * @Version: 1.0
 **/
public class SiginService {

    /**
     * @Author zhy
     * @Description 注册方法
     * @Date 16:21 2019/6/10
     * @Param [username, password]
     * @return com.zhy.pattern.adapterPattern.loginadapter.ResultMsg
    **/
    public ResultMsg regist(String username,String password){
        return new ResultMsg(200,"注册成功",new Member());
    }

    /**
     * @Author zhy
     * @Description 登录方法
     * @Date 16:22 2019/6/10
     * @Param [username, password]
     * @return com.zhy.pattern.adapterPattern.loginadapter.ResultMsg
    **/
    public ResultMsg login(String username,String password){
        return null;
    }

}
