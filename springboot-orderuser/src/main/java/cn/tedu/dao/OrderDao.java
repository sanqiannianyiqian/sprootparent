package cn.tedu.dao;

import cn.tedu.pojo.Order;
import org.apache.ibatis.annotations.Param;

/**
 * @author Mangmang
 * @date 2020/2/8 20:54
 */
public interface OrderDao {
    /**
     * 根据订单编号查询订单信息
     * @param order_id 要查询的订单编号
     * @return 查到的订单信息bean
     */
public Order selectOrderById(@Param("order_id") String order_id);
}
