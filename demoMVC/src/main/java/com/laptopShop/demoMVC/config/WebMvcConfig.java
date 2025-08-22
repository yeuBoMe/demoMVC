package com.laptopShop.demoMVC.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Đăng ký thư mục uploads/images/avatar làm nơi lưu trữ tài nguyên tĩnh
        registry.addResourceHandler("/upload/images/avatar/**")
                .addResourceLocations("file:upload/images/avatar/");

        registry.addResourceHandler("/upload/images/product/**")
                .addResourceLocations("file:upload/images/product/");
    }
}
