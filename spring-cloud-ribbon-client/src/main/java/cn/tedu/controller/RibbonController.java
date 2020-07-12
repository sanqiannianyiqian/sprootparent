package cn.tedu.controller;

import cn.tedu.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mangmang
 * @date 2020/2/10 13:31
 */
@RestController
public class RibbonController {
@Autowired
    private RibbonService ribbonService;
    //localhost:9004/ribbon/hello?name=wang
    //ribbon也想给它返回一个英文，
    //假设当前ribbon工程不具备说英文的能力，这次请求虽然
    //到达了该ribbon的web应用，无法单独处理功能
    //想方法实现调用service-hi的功能
    @RequestMapping("ribbon/hello")
    public String sayHello(String name) {
        return "ribbon" + ribbonService.sayHello(name);
    }
}
