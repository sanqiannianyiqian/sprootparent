package cn.tedu.service;

/**
 * @author Mangmang
 * @date 2020/2/8 21:05
 */
public interface OrderService {
    /**
     * 支付订单
     * @param orderId 要支付的订单编号
     */
    void pay(String orderId);
}
