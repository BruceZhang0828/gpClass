package com.zhy.pattern.proxyPattern.staticProxy;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class DynamicDataSourceEntryTest {

    public static void main(String[] args) {
        try {
            Order order = new Order();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date date = simpleDateFormat.parse("2017/02/07");
            order.setCreatTime(date.getTime());
            IOrderService orderServiceStaticProxy = new OrderServiceStaticProxy(new IOrderServiceImpl());
            orderServiceStaticProxy.createOrder(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
