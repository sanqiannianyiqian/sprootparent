package cn.tedu.service;

import cn.tedu.dao.OrderDao;
import cn.tedu.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Mangmang
 * @date 2020/2/8 21:08
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public void pay(String orderId) {
        //1.支付订单将订单状态从未支付改为已支付
        System.out.println("支付订单.." + orderId);
        //2.获取订单金额信息，计算该订单对应的积分
        Order order = orderDao.selectOrderById(orderId);
        int money = order.getOrder_money() ;
        //RestTemplate实现http请求的发送，按照接口文件
        //将money放到请求参数，发送给用户系统接收请求
        //发送请求到用户系统

        //url第一应该做到nginx的负载均衡，域名80端口访问
        String url = "http://test-user/user/update?money="+money;
        /**个人笔记:
         * 如果使用feign来调用,先定义一个feign接口,这个接口和HelloService是两个接口,
            然后在HelloService的实现类中的这一块就可以调用feign的接口去访问其他微服务,
            要先Autowired feign的接口 **/
        restTemplate.getForObject(url, String.class);
    }
}
