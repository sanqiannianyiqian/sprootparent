package cn.tedu.service;

import cn.tedu.dao.OrderDao;
import cn.tedu.dao.UserDao;
import cn.tedu.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mangmang
 * @date 2020/2/8 21:08
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Autowired
   private UserDao userDao;

    @Override
    public void pay(String orderId) {
        //1.支付订单将订单状态从未支付改为已支付
        System.out.println("支付订单.." + orderId);
        //2.获取订单金额信息，计算该订单对应的积分
        Order order = orderDao.selectOrderById(orderId);
        int point = order.getOrder_money() * 1;
        //3.将积分更新到用户信息中
        userDao.addPoint(order.getUser_id(), point);
    }
}
