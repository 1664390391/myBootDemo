package com.speedchina.AddressMatch.service.serviceImpl;

import com.speedchina.AddressMatch.dao.InterfaceServerDao;
import com.speedchina.AddressMatch.dao.LoginDao;
import com.speedchina.AddressMatch.model.InterfaceServer;
import com.speedchina.AddressMatch.model.SysUser;
import com.speedchina.AddressMatch.service.InterfaceServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("InterfaceServerService")
public class InterfaceServerServiceImpl implements InterfaceServerService {

    @Autowired
    private InterfaceServerDao interfaceServerDao;

    @Override
    public int saveInterfaceServer(InterfaceServer interfaceServer) {
        return interfaceServerDao.saveInterfaceServer(interfaceServer);
    }

    @Override
    public int updateParamsById(InterfaceServer interfaceServer) {
        return interfaceServerDao.updateParamsById(interfaceServer);
    }

    @Override
    public List<InterfaceServer> selectByParams(Map<String, Object> map) {
        return interfaceServerDao.selectByParams(map);
    }
}
