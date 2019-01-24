package com.speedchina.AddressMatch.service;


import com.speedchina.AddressMatch.model.InterfaceServer;

import java.util.List;
import java.util.Map;

public interface InterfaceServerService {
    int saveInterfaceServer(InterfaceServer interfaceServer);

    int updateParamsById(InterfaceServer interfaceServer);

    List<InterfaceServer> selectByParams(Map<String,Object> map);
}
