package com.springcloud.example.test.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Devin on 2017/11/7.
 */
@FeignClient(value = "user-api")
public interface TestService {

    @RequestMapping(value = "/user/getUser",method = RequestMethod.POST)
    public void getUser();
}
