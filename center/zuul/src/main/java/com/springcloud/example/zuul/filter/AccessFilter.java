package com.springcloud.example.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;


/**
 * Created by Devin on 2017/11/7.
 */
@Component
public class AccessFilter extends ZuulFilter{


    private static Logger logger = Logger.getLogger(AccessFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        return null;
    }
}
