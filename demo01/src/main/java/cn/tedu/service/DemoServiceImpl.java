package cn.tedu.service;

import cn.tedu.dao.DemoDao;
import cn.tedu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mangmang
 * @date 2020/2/7 22:58
 */
@Service
public class DemoServiceImpl implements DemoService{
    @Autowired
    DemoDao demoDao;
    public User getUserById(Integer userId){
        return demoDao.selectUserByUserId(userId);
    };
}
