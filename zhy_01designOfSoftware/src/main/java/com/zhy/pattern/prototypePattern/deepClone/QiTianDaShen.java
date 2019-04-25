package com.zhy.pattern.prototypePattern.deepClone;

import java.io.*;
import java.util.Date;

/**
 * @ClassName: QiTianDaShen
 * @Description: 齐天大圣的类
 * @auther: zhy
 * @Date: 2019/4/24 11:39
 * @Version: 1.0
 **/
public class QiTianDaShen extends Monkey implements Cloneable, Serializable {
    public JinGuBang jinGuBang;

    public QiTianDaShen() {
        //初始化
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    private Object deepClone() {

        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            QiTianDaShen copy = (QiTianDaShen)ois.readObject();
            copy.birthday = new Date();
            return copy;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public QiTianDaShen shallowClone(QiTianDaShen target){
        QiTianDaShen qiTianDaShen = new QiTianDaShen();
        qiTianDaShen.height = target.height;
        qiTianDaShen.weight = target.weight;

        qiTianDaShen.birthday = new Date();
        qiTianDaShen.jinGuBang = target.jinGuBang;

        return qiTianDaShen;
    }
}
