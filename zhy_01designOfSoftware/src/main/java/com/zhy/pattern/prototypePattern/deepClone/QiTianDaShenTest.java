package com.zhy.pattern.prototypePattern.deepClone;

/**
 * @ClassName: QiTianDaShenTest
 * @Description: 深度克隆 测试代码
 * @auther: zhy
 * @Date: 2019/4/24 11:51
 * @Version: 1.0
 **/
public class QiTianDaShenTest {
    public static void main(String[] args) {
        QiTianDaShen qiTianDaShen = new QiTianDaShen();

        try {
            QiTianDaShen deepClone = (QiTianDaShen)qiTianDaShen.clone();
            System.out.println("深度克隆:"+(qiTianDaShen.jinGuBang==deepClone.jinGuBang));
        } catch (Exception e) {
            e.printStackTrace();
        }
        QiTianDaShen q = new QiTianDaShen();
        QiTianDaShen shallowClone = q.shallowClone(q);

        System.out.println("浅克隆: "+(q.jinGuBang==shallowClone.jinGuBang));
    }
}
