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

@Api(description = "首页")
@Controller
@RequestMapping("/")
public class RestController {

    @ApiOperation(value = "首页",notes = "首页描述")
    @ResponseBody
    @RequestMapping(value ="/index",method = RequestMethod.POST)
    public String index(){
        return "hello world";
    }

}
