package com.zhy.pattern.proxyPattern.staticProxy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * @ClassName: OrderServiceStaticProxy
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/4/28 10:41
 * @Version: 1.0
 **/
public class OrderServiceStaticProxy implements IOrderService {
    private SimpleDateFormat yearFormat  = new SimpleDateFormat("yyyy");

    private IOrderService iOrderService;

    public OrderServiceStaticProxy(IOrderService iOrderService){
        this.iOrderService = iOrderService;
    }
    public int createOrder(Order order) {
        before();
        Long creatTime = order.getCreatTime();
        Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(creatTime)));
        System.out.println("静态代理自动分配到[DB_"+dbRouter+"]数据源处理数据.");
        DynamicDataSourceEntry.set(dbRouter);
        int save = iOrderService.createOrder(order);
        after();
        return save;
    }


    private void before(){
        System.out.println("Proxy before method");
    }

    private void after(){
        System.out.println("Proxy after method");
    }
}
