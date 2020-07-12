package cn.tedu.controller;

import cn.tedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService = null;

    @ResponseBody
    @RequestMapping("/point")
    public String point(String userId) {
        int point = userService.point(userId);
        return "{\"points\":\"" + point + "\"}";
    }

    @ResponseBody
    @RequestMapping("/update")
    public Integer update(Integer money) {
        //调用业务层 money与积分业务逻辑有关
        //调用业务层代码
        try {
            userService.pointUpdate(money);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
