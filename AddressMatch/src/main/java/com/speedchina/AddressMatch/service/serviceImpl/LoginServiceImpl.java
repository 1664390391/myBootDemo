package com.speedchina.AddressMatch.service.serviceImpl;

import com.speedchina.AddressMatch.dao.LoginDao;
import com.speedchina.AddressMatch.model.SysUser;
import com.speedchina.AddressMatch.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    @Override
    public SysUser login(String userName, String password) {
        SysUser sysUser = loginDao.findUserByName(userName,password);
        return sysUser;
    }
}
