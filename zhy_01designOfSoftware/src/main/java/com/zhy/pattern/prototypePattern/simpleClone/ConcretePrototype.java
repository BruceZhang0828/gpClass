package com.zhy.pattern.prototypePattern.simpleClone;

import java.util.List;

/**
 * @ClassName: ConcretePrototype
 * @Description: 创建具体需要克隆的对象
 * @auther: zhy
 * @Date: 2019/4/24 10:54
 * @Version: 1.0
 **/
public class ConcretePrototype implements Prototype {

    private int age;

    private String name;

    private List hobbies;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    public Prototype clone() {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAge(this.age);
        concretePrototype.setName(this.name);
        concretePrototype.setHobbies(this.hobbies);
        return concretePrototype;
    }
}
