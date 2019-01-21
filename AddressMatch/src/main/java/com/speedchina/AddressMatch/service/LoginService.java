package com.speedchina.AddressMatch.service;

import com.speedchina.AddressMatch.model.SysUser;

public interface LoginService {
    /**
     * 登陆
     *
     * @param userName
     * @param password
     * @return
     */
    SysUser login(String userName, String password);
}
