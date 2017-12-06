package com.springcloud.example.test.service;

import com.springcloud.example.test.service.hystrix.TestServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Devin on 2017/11/7.
 */
@FeignClient(value = "user-api-v1-0",fallback = TestServiceHystrix.class)
public interface TestService {

    @RequestMapping(value = "/user/getUser",method = RequestMethod.POST)
    public void getUser();
}
