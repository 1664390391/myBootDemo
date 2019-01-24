package com.speedchina.AddressMatch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 系统配置相关处理
 */
@Controller
@RequestMapping("/systemConfig")
public class SystemConfigController {

    /**
     * 跳转到使用说明页面
     * @author lt
     * @return
     */
    @RequestMapping("/toUseDescPage")
    public String toUseDescPage(){
        return "usedesc/useDesc";
    }

}
