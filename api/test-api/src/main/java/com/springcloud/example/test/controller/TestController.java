package com.springcloud.example.test.controller;


import com.springcloud.example.test.dto.TestDto;
import com.springcloud.example.test.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;


/**
 * 测试
 * Created by Devin on 2017/10/23.
 */
@RestController
@RefreshScope
@RequestMapping(value="/test")
@Api(value = "/test", description = "测试接口")
public class TestController{

    private static final Logger logger = Logger.getLogger(TestController.class);
    @Autowired
    private TestService testService;

    @ApiOperation(value="测试", notes="示例，测试")
    @RequestMapping(value = "/test" ,method = RequestMethod.POST)
    public void test(@RequestBody TestDto dto)  throws Exception {
        testService.getUser();
    }

}
