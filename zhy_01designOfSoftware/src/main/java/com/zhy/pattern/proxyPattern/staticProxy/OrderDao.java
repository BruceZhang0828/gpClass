package com.zhy.pattern.proxyPattern.staticProxy;

/**
 * @ClassName: Orderdao
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/4/26 18:37
 * @Version: 1.0
 **/
public class OrderDao {
    public int insert(Order order){
        System.out.println("OrderDao 创建 Order 成功");
        return 1;
    }
}
