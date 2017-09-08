package com.example.demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * <dl>
 * <dt>Devin/dt>
 * <dd>Description:</dd>
 * <dd>Company: 浙江链川信息技术有限公司</dd>
 * <dd>CreateDate: 2017/9/8</dd>
 * </dl>
 *
 * @author Administrator
 */
public class SpringBootStartApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(JavaPublicDemoApplication.class);
    }
}
