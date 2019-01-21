package com.speedchina.AddressMatch.dao;


import com.speedchina.AddressMatch.model.SysUser;
import com.speedchina.AddressMatch.util.CommonMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginDao extends CommonMapper<SysUser> {
    /**
     * 登陆
     *
     * @param userName
     * @param password
     * @return
     */
    SysUser findUserByName(@Param("userName") String userName, @Param("password")String password);
}
