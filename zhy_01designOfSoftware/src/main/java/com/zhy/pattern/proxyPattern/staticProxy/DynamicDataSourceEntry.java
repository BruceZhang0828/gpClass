package com.zhy.pattern.proxyPattern.staticProxy;

/**
 * @ClassName: DynamicDataSourceEntry
 * @Description: 动态切换数据源
 * @auther: zhy
 * @Date: 2019/4/26 18:53
 * @Version: 1.0
 **/
public class DynamicDataSourceEntry  {
    //默认数据库
    public final static String DEFAULT_SOURCE = null;

    private final static ThreadLocal<String> local = new ThreadLocal<String>();

    private DynamicDataSourceEntry(){}

    //清空数据库
    public static void clear(){
        local.remove();
    }

    //获取当前使用的数据源名称
    public static String get(){
        return local.get();
    }

    //还原当前切面的数据源

    public static void restore(){
        local.set(DEFAULT_SOURCE);
    }

    //设置已知名称的数据源

    public static void set(String source){
        local.set(source);
    }

    //根据年份动态设置数据源

    public static void set(int year){
        local.set("DB_"+year);
    }



}
