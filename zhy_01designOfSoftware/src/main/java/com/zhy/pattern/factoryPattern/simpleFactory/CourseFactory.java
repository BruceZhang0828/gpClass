package com.zhy.pattern.factoryPattern.simpleFactory;

/**
 * @ClassName: CourseFactory
 * @Description: 简单工厂
 * @auther: zhy
 * @Date: 2019/4/19 17:36
 * @Version: 1.0
 **/
public class CourseFactory {
    public ICourse create(String courceName){

        if ("java".equals(courceName)){
            return new JavaCourse();
        }else{
            return null;
        }
    }


    public ICourse createCourse(String className){
        try {
            if (!(null == className || "".equals(className))){

                return (ICourse) Class.forName(className).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public ICourse createByClazz(Class clazz){
            try {
                if (clazz!=null) {
                    return (ICourse) clazz.newInstance();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            return null;
    }
}
