package com.springcloud.example.test.service.hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.example.test.service.TestService;
import org.springframework.stereotype.Component;

/**
 * Created by Devin on 2017/11/7.
 */
@Component
public class TestServiceHystrix implements TestService{


    @Override
    public void getUser() {

    }
}
