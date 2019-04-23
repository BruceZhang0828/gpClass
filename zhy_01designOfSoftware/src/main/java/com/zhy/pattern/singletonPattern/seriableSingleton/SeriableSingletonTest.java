package com.zhy.pattern.singletonPattern.seriableSingleton;

import java.io.*;

/**
 * @ClassName: SeriableSingletonTest
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/4/23 17:16
 * @Version: 1.0
 **/
public class SeriableSingletonTest {
    public static void main(String[] args) {
        SeriableSingleton seriableSingleton1 = null;
        SeriableSingleton seriableSingleton2 = SeriableSingleton.getInstance();

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(seriableSingleton2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            seriableSingleton1 = (SeriableSingleton)ois.readObject();
            ois.close();

            System.out.println(seriableSingleton1);
            System.out.println(seriableSingleton2);
            System.out.println(seriableSingleton1==seriableSingleton2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
