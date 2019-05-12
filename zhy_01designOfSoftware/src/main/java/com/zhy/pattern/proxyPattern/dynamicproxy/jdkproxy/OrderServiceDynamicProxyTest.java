package com.zhy.pattern.proxyPattern.dynamicproxy.jdkproxy;

import com.zhy.pattern.proxyPattern.staticProxy.IOrderService;
import com.zhy.pattern.proxyPattern.staticProxy.IOrderServiceImpl;
import com.zhy.pattern.proxyPattern.staticProxy.Order;
import com.zhy.pattern.proxyPattern.staticProxy.OrderServiceStaticProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: OrderServiceDynamicProxyTest
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/5/5 10:26
 * @Version: 1.0
 **/
public class OrderServiceDynamicProxyTest {

    public static void main(String[] args) {
        try{
            Order order = new Order();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2018/02/01");
            order.setCreatTime(date.getTime());
            IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy().getInstance(new IOrderServiceImpl());
            int insert = orderService.createOrder(order);
            System.out.println(insert);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
