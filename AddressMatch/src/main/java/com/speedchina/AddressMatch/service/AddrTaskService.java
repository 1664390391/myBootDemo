package com.speedchina.AddressMatch.service;


import com.speedchina.AddressMatch.model.AddrTask;

import java.util.HashMap;
import java.util.List;

public interface AddrTaskService {

    int getAddrTaskTotalCount(HashMap<String, String> map);

    List<AddrTask> selectByParams(HashMap<String, String> map);

}
