package com.speedchina.AddressMatch.service.serviceImpl;

import com.speedchina.AddressMatch.dao.AddrTaskDao;
import com.speedchina.AddressMatch.model.AddrTask;
import com.speedchina.AddressMatch.service.AddrTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service("addrTaskService")
public class AddrTaskServiceImpl implements AddrTaskService {

    @Autowired
    private AddrTaskDao addrTaskDao;


    @Override
    public int getAddrTaskTotalCount(HashMap<String, String> map) {
        return addrTaskDao.getAddrTaskTotalCount(map);
    }

    @Override
    public List<AddrTask> selectByParams(HashMap<String, String> map) {
        return addrTaskDao.selectByParams(map);
    }
}
