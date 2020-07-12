package cn.tedu.dao;

import cn.tedu.pojo.User;

/**
 * @author Mangmang
 * @date 2020/2/7 22:45
 */
public interface DemoDao {
    public User selectUserByUserId(Integer userId);
}
