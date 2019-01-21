package com.speedchina.AddressMatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.*;

/**
 * 配置一些web的安全项
 *
 * 1、配置登录拦截，实现WebMvcConfigurer接口，并实现里面两个方法。第二个 addInterceptors 方法用来注册添加拦截器。
 * 注意：在老版本的 spring-boot 中使用的是WebMvcConfigurerAdapter，新版本中已过时！
 * 还有不能通过继承 WebMvcConfigurationSupport 这个类来实现，这样会在某些情况下失效！
 */
@Configuration
public class WebSecurityConfig implements WebMvcConfigurer {

    @Autowired
    private LoginInterceptor loginInterceptor;

    //该方法是用来配置静态资源的，static下面所有资源都是静态的
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        if(!registry.hasMappingForPattern("/static/**")){
//            registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
//        }
    }

    /*
    该方法用来注册拦截器，我们自己写好的拦截器需要这里添加注册才能生效，例如这里的loginInterceptor
    我的理解是项目启动的时候就加载了，后期都直接读对象数据，只需要在自己定义拦截器中写好判断方式
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        InterceptorRegistration addInterceptor = registry.addInterceptor(loginInterceptor);
//        addInterceptor.addPathPatterns("/**");
//        addInterceptor.excludePathPatterns("/loginController/toLoginPage");

        // addPathPatterns("/**") 表示拦截所有的请求，
        // excludePathPatterns("/login", "/register") 表示除了登陆与注册之外，因为登陆注册不需要登陆也可以访问

        registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns("/loginController/toLoginPage","/loginController/loginByInfo","/static/**");
    }

    //默认登录页
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/login");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }
}

