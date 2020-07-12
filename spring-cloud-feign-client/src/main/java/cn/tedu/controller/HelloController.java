package cn.tedu.controller;

import cn.tedu.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;
    @RequestMapping("hello")//9005/hello
    public String sayHi(String name){
        return "FEIGN:"+helloService.sayHi(name);
    }

}
