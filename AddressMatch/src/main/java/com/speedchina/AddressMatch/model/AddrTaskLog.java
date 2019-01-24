package com.speedchina.AddressMatch.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


/**
 *
 * @Since 2010-2019
 * @Description: TODO
 * @author ***
 * @date 2019-01-22 11:53:52
 *
 */
public class AddrTaskLog {
	
	//columns START
	/**
	 * @Fields id:id
	 */
	private String id;
	
	/**
	 * @Fields taskId:操作任务id
	 */
	private String taskId;
	
	/**
	 * @Fields matchDesc:匹配数量记录
	 */
	private String matchDesc;
	
	/**
	 * @Fields resultPath:文件结果路径
	 */
	private String resultPath;
	
	/**
	 * @Fields addTime:addTime
	 */
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date addTime;
	
	/**
	 * @Fields updateTime:updateTime
	 */
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date updateTime;
	
	//columns END

	public AddrTaskLog(){
	}

	public AddrTaskLog(String id){
		this.id = id;
	}

	
	public void setId(String id){
		this.id = id;
	}
	
	public String getId(){
		return id;
	}
	
	public void setTaskId(String taskId){
		this.taskId = taskId;
	}
	
	public String getTaskId(){
		return taskId;
	}
	
	public void setMatchDesc(String matchDesc){
		this.matchDesc = matchDesc;
	}
	
	public String getMatchDesc(){
		return matchDesc;
	}
	
	public void setResultPath(String resultPath){
		this.resultPath = resultPath;
	}
	
	public String getResultPath(){
		return resultPath;
	}
	
	public void setAddTime(Date addTime){
		this.addTime = addTime;
	}
	
	public Date getAddTime(){
		return addTime;
	}
	
	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}
	
	public Date getUpdateTime(){
		return updateTime;
	}


}