package com.speedchina.AddressMatch.dao;


import com.speedchina.AddressMatch.model.AddrTask;
import com.speedchina.AddressMatch.util.CommonMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface AddrTaskDao extends CommonMapper<AddrTask> {

    int getAddrTaskTotalCount(HashMap<String, String> map);

    List<AddrTask> selectByParams(HashMap<String, String> map);

}
