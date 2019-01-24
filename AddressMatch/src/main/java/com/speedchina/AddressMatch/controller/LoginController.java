package com.speedchina.AddressMatch.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.speedchina.AddressMatch.model.SysUser;
import com.speedchina.AddressMatch.service.LoginService;
import com.speedchina.AddressMatch.util.MD5Helper;
import com.speedchina.AddressMatch.util.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     * 跳转到主页面
     * @author lt
     * @return
     */
    @RequestMapping("/toIndexPage")
    public String toIndexPage(){
        return "index";
    }

    /**
     * 跳转到登录页面
     * @author lt
     * @return
     */
    @RequestMapping("/toLoginPage")
    public  String toLoginPage(){
        return "login";
    }

    /**
     * 登陆
     * @param userName 用户名
     * @param password 密码
     * @return CustomUserModel用户信息
     */
    @ResponseBody
    @RequestMapping(value = "/loginByInfo")
    public ObjectNode loginByInfo(HttpSession session, @RequestParam("userName") String userName,
                                   @RequestParam("password") String password)
    {
        ObjectNode resultNode = new ObjectMapper().createObjectNode();
        try
        {
            SysUser user= null;
            //密码加密处理
            if(!Tools.isStrEmpty(password)){
                user = loginService.login(userName,MD5Helper.stringMD5(password));
            }
            if (user != null)
            {
                session.setAttribute("user", user);
                resultNode.put("responseCode", 200);
//                resultNode.putPOJO("user", user);
            }else{
                //如果重新登录并且不成功，就把session里面的user属性置位null
                session.setAttribute("user", null);
                resultNode.put("responseCode", 400);
                resultNode.put("msg", "用户名错误");
            }
        } catch (Exception e)
        {
            e.printStackTrace();
            resultNode.put("responseCode", 500);
            return resultNode;
        }
        return resultNode;
    }

}
