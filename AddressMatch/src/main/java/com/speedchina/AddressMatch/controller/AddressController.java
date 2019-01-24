package com.speedchina.AddressMatch.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.speedchina.AddressMatch.model.AddrTask;
import com.speedchina.AddressMatch.model.SysUser;
import com.speedchina.AddressMatch.service.AddrTaskService;
import com.speedchina.AddressMatch.service.LoginService;
import com.speedchina.AddressMatch.util.MD5Helper;
import com.speedchina.AddressMatch.util.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 处理地址的相关操作
 */
@Controller
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddrTaskService addrTaskService;

    /**
     * 跳转到数据批次列表页面
     * @author lt
     * @return
     */
    @RequestMapping("/toAddressBatchListPage")
    public String toAddressBatchListPage(){
        return "address/addressBatchListPage";
    }

//    @RequestMapping(value = "/getAddrTaskList"/*,produces = "text/plain;charset=UTF-8"*/)
    @RequestMapping("/getAddrTaskList")
    @ResponseBody
    public Map<String,Object> getAddrTaskList(int pageSize, int pageNum, HttpServletRequest request){
        Map<String,Object> resultMap = new HashMap<>(4);
        try{
            HashMap<String, String> paramsMap = new HashMap(8){{
                //查询参数
                put("isHandle", request.getParameter("isHandle"));
                put("startDate", request.getParameter("startDate"));
                put("endDate", request.getParameter("endDate"));
                put("taskName", request.getParameter("taskName"));
                //自定义分页，from：从哪一条开始搜索。pageSize：每页查询数量
                put("from", String.valueOf((pageNum-1)*pageSize));
                put("pageSize", String.valueOf(pageSize));
            }};
            int totalCount = addrTaskService.getAddrTaskTotalCount(paramsMap);
            List<AddrTask> resultList = addrTaskService.selectByParams(paramsMap);
            resultMap.put("total",totalCount);
            resultMap.put("resultList",resultList);
            resultMap.put("responseCode",200);
        }catch (Exception e){
            e.printStackTrace();
            resultMap.put("responseCode",400);
        }
        return resultMap;
    }


    /**
     * 跳转到数据导入页面
     * @author lt
     * @return
     */

    /**
     * 跳转到数据匹配页面
     * @author lt
     * @return
     */


}
