package com.speedchina.AddressMatch.dao;


import com.speedchina.AddressMatch.model.InterfaceServer;
import com.speedchina.AddressMatch.util.CommonMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface InterfaceServerDao extends CommonMapper<InterfaceServer> {

    int saveInterfaceServer(InterfaceServer interfaceServer);

    int updateParamsById(InterfaceServer interfaceServer);

    List<InterfaceServer> selectByParams(Map<String,Object> map);
}
