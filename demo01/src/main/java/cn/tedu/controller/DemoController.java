package cn.tedu.controller;

import cn.tedu.pojo.User;
import cn.tedu.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mangmang
 * @date 2020/2/7 23:00
 */
@RestController
public class DemoController {
    @Autowired
    DemoService demoService;
    //localhost:8080/getUser?userId=1
    @RequestMapping("/getUser")
    public User getUser(Integer userId) {
        return demoService.getUserById(userId);
    }
}
