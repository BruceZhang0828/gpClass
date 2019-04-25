package com.zhy.pattern.prototypePattern.simpleClone;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: PrototypeTest
 * @Description: 简单克隆测试类
 * @auther: zhy
 * @Date: 2019/4/24 11:07
 * @Version: 1.0
 **/
public class PrototypeTest {
    public static void main(String[] args) {
        //创建一个需要克隆的对象
        ConcretePrototype concretePrototype  = new ConcretePrototype();
        concretePrototype.setName("小明");
        concretePrototype.setAge(19);
        List<String> hobbies = new ArrayList<String>();
        hobbies.add("游泳");
        hobbies.add("骑马");
        concretePrototype.setHobbies(hobbies);

        System.out.println(concretePrototype);

        //创建 Client对象,准备开始克隆
        Client client = new Client(concretePrototype);
        ConcretePrototype concretePrototypeClone = (ConcretePrototype)client.startClone(concretePrototype);
        System.out.println(concretePrototypeClone);
        System.out.println("克隆对象中的引用类型地址值:"+concretePrototypeClone.getHobbies());
        System.out.println("原对象中的引用类型地址值:"+concretePrototype.getHobbies());
        System.out.println("对象地址值比较:"+(concretePrototypeClone.getHobbies()==concretePrototype.getHobbies()));
        hobbies.add("开卡丁车");
        concretePrototype.setHobbies(hobbies);

        System.out.println("克隆对象中的引用类型地址值:"+concretePrototypeClone.getHobbies());
        System.out.println("原对象中的引用类型地址值:"+concretePrototype.getHobbies());
    }
}
