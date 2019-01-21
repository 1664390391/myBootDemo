package com.speedchina.AddressMatch.util;

/**
 * @Description:通用DAO基础接口，其他的DAO继承该接口即可
 */

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;


public interface CommonMapper<T> extends Mapper<T>, MySqlMapper<T> {
    //TODO
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
}
