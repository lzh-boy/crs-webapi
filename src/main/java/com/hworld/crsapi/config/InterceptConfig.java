package com.hworld.crsapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.Collections;

@Configuration
public class InterceptConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new MyInterceptConfig())
                .addPathPatterns("/*/**") //拦截所有请求
                .excludePathPatterns(getExcludePathPatterns()); //不拦截Swagger
    }

    private ArrayList<String> getExcludePathPatterns() {
        ArrayList<String> list = new ArrayList<>();
        String[] urls = {
                "/v2/api-docs",
                "/swagger-resources/**",
                "/webjars/**",
                "/swagger-ui.html"
        };
        Collections.addAll(list, urls);
        return list;
    }
}
