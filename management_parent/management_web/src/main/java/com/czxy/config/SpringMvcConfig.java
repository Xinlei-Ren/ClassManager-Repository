package com.czxy.config;

import com.czxy.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @author huangdonghu
 * @version 1.0
 * @date 2019/7/31 20:18
 */
@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {

    @Resource
    private UserInterceptor userInterceptor;

    /**
     * 注册登录器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(userInterceptor);
        interceptorRegistration.addPathPatterns("/**");
    }
}
