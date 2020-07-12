package cn.tedu.service;

import cn.tedu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int point(String userId) {
        return userDao.queryPoint(userId);
    }

    @Override
    public void pointUpdate(Integer money) {
        //实现一个2倍积分
        int point=money*2;
        userDao.addPoint("1",point);
    }
}
