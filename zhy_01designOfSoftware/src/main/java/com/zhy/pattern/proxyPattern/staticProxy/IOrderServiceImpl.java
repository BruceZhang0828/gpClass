package com.zhy.pattern.proxyPattern.staticProxy;

/**
 * @ClassName: IOrderServiceImpl
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/4/26 18:43
 * @Version: 1.0
 **/
public class IOrderServiceImpl implements IOrderService {
    private OrderDao orderDao;

    public IOrderServiceImpl(){
        orderDao = new OrderDao();
    }
    public int createOrder(Order order) {
        return orderDao.insert(order);
    }
}
