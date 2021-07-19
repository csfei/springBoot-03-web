package com.cuisf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;


//如果我们要扩展springMVC  官方建议我们下面的操作  @Configuration同时实现WebMvcConfigration
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

    }


    //视图跳转
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/cuisf").setViewName("index");
    }

    /**
     * SpringBoot 在自动装配很多组件的时候，先看容器中有没有用户自己配置的（如果用户自己配置并@Bean 到Spring 中）
     *   若果有就用用户组件配置的，如果没有自己的就用自动配置的；如果有些组件可以使用多个，比如我们的视图解析器吗，就将用户配置的
     *   和系统默认的组合起来
     * @return
     */

    @Bean
    public ViewResolver myViewResolver(){
        return new MyViewResolver();
    }

    //自定义一个自己的视图解析器
    public static class  MyViewResolver implements ViewResolver{

        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }
}
