package com.springcloud.example.user.controller;


import com.springcloud.example.user.config.AppConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;


/**
 * 用户
 * Created by Devin on 2017/10/23.
 */
@RestController
@RefreshScope
@RequestMapping(value="/user")
@Api(value = "/user", description = "用户接口")
public class UserController {

    private static final Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private AppConfig appConfig;

    @ApiOperation(value="用户", notes="示例，获取用户")
    @RequestMapping(value = "/getUser" ,method = RequestMethod.POST)
    public String getUser()  throws Exception {
        logger.info("访问用户成功");
        return appConfig.getAppName();

    }

}
