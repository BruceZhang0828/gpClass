package com.zhy.pattern.singletonPattern.registeSingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName: ContainerSingleton
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/4/23 23:07
 * @Version: 1.0
 **/
public class ContainerSingleton {
    private ContainerSingleton(){}

    private static Map<String,Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getBean(String className){
        synchronized (ioc){
            if (!ioc.containsKey(className)){
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className,obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                return obj;
            }else {
                return ioc.get(className);
            }
        }
    }
}
