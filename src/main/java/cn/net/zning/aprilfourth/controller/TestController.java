package cn.net.zning.aprilfourth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/666")
    @ResponseBody
    public String test() {
        return "跨越长城，走向世界。";
    }
    
}
