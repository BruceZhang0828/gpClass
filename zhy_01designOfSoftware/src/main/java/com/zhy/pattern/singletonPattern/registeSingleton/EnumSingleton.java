package com.zhy.pattern.singletonPattern.registeSingleton;

/**
 * @ClassName: EnumSingleton
 * @Description: 枚举式单例
 * @auther: zhy
 * @Date: 2019/4/23 17:46
 * @Version: 1.0
 **/
public enum EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getData(){
        return data;
    }

    public void setData(Object data){
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
