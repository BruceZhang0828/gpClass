package com.zhy.pattern.factoryPattern.abstractFactory;

import com.zhy.pattern.factoryPattern.simpleFactory.ICourse;

/**
 * @ClassName: AbstractFactory
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/4/21 21:08
 * @Version: 1.0
 **/
public interface AbstractFactory {
    ICourse createCourse();
    INote createNote();
    ISource createSourse();

}
