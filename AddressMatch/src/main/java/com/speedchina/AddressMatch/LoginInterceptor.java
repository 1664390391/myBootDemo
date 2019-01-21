package com.speedchina.AddressMatch;

import com.speedchina.AddressMatch.model.SysUser;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 验证拦截登录
 * 每个拦截器都需要实现HandlerInterceptor接口，该接口有三个方法，每个方法会在请求调用的不同时期完成
 * 我们这里需要周在接口调用之前拦截请求，判断是否登录，所以这里需要使用preHandle()，里面写验证，最后返回true/false。
 * 记住加@Component注解，我们需要在上一步的WebSecurityConfig类中注入。user是自定义的类。
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {


    //这个方法是在访问接口之前执行的，我们只需要在这里写验证登陆状态的业务逻辑，就可以在用户调用指定接口之前验证登陆状态了
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       //每一个项目对于登陆的实现逻辑都有所区别，我这里使用最简单的Session提取User来验证登陆。
        HttpSession session = request.getSession();
        //这里的User是登陆时放入session的
         SysUser user = (SysUser) session.getAttribute("user");
        //如果session中没有user，表示没登陆
        if (user == null){
            //这个方法返回false表示忽略当前请求，如果一个用户调用了需要登陆才能使用的接口，如果他没有登陆这里会直接忽略掉
            System.out.println("-------没有登录-------");
            String url = "/loginController/toLoginPage";
            response.sendRedirect(url);
            return false;
        }else {
            System.out.println("-------用户："+user.getUserName()+"，已登录-------");
            return true;    //如果session里有user，表示该用户已经登陆，放行，用户即可继续调用自己需要的接口
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

    }
}
