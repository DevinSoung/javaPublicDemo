package com.example.demo.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Devin on 2017/6/26.
 */
@Api(description = "测试方法")
@Controller
@RequestMapping("/test")
public class TestController {


    @RequestMapping(value = "／",method = RequestMethod.GET)
    @ApiOperation(value = "测试接口",notes = "测试接口详细描述")
    public String test(){
        return "success";
    }

}
