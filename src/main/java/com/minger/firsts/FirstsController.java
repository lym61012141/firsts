package com.minger.firsts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Yuming-Liu
 * 日期： 2018-01-21
 * 时间： 16:51
 */
@Controller
public class FirstsController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return "index";
    }

}
