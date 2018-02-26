package com.shoes.scarecrow.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangyucheng
 * @description
 * @create 2018/2/12 11:52
 */
@Controller
public class UserController {


    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "test";
    }

}