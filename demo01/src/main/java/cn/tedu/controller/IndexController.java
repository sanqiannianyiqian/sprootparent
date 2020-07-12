package cn.tedu.controller;

import cn.tedu.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mangmang
 * @date 2020/2/6 21:34
 */
//RestController spring更新升级过程中出现了
//组合注解，可以将单独功能的多个注解组合成新的注解，新的注解
//具备所有单个注解的功能
@RestController//专门为当前环境中习惯使用ajax交互逻辑准备的
//组合注解，当前controller类的所有方法的返回值，都会封装到
//响应体的数据中
public class IndexController {
    @Autowired
    private IndexService indexService;
    //接收一个请求 /hello 接收参数 name 返回打招呼
    @RequestMapping("/hello")
    //@ResponseBody//将返回值直接作为响应体内容不去拼接
    //页面前缀后缀，访问页面
    public String sayHi(String name){
        return indexService.sayHi(name);
    }
}
