package com.qianfeng.project.meeting.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
    @RequestMapping("demo")
    @ResponseBody
    public String demo(){

        return "小马吃屎";
    }
}
