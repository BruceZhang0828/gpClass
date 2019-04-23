package com.zhy.pattern.singletonPattern.registeSingleton;

import com.zhy.pattern.singletonPattern.seriableSingleton.SeriableSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @ClassName: EnumSingletonTest
 * @Description: 枚举式 注册单例 test
 * @auther: zhy
 * @Date: 2019/4/23 17:51
 * @Version: 1.0
 **/
public class EnumSingletonTest {
    public static void main(String[] args) {
        try {
            EnumSingleton enumSingleton1 = null;
            EnumSingleton enumSingleton2 = EnumSingleton.getInstance();
            enumSingleton2.setData(new Object());
            FileOutputStream fos = null;
            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(enumSingleton2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            enumSingleton1 = (EnumSingleton) ois.readObject();
            ois.close();

            System.out.println(enumSingleton1.getData());
            System.out.println(enumSingleton2.getData());
            System.out.println(enumSingleton1.getData()==enumSingleton1.getData());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
