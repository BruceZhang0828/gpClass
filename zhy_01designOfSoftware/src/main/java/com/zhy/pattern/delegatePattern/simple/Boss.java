package com.zhy.pattern.delegatePattern.simple;

/**
 * @ClassName: Boss
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/5/28 14:31
 * @Version: 1.0
 **/
public class Boss {
    public void command(String command,Leader leader){
        leader.doing(command);
    }
}
