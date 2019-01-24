package com.speedchina.AddressMatch.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


/**
 *
 * @Since 2010-2019
 * @Description: TODO
 * @author ***
 * @date 2019-01-22 11:53:54
 *
 */
public class AddrTask{
	
	//columns START
	/**
	 * @Fields id:id
	 */
	private String id;
	
	/**
	 * @Fields taskName:任务名称
	 */
	private String taskName;
	
	/**
	 * @Fields taskDesc:任务描述
	 */
	private String taskDesc;
	
	/**
	 * @Fields interfaceId:所属服务接口id
	 */
	private String interfaceId;
	
	/**
	 * @Fields filePath:所属文件路径
	 */
	private String filePath;
	
	/**
	 * @Fields addTime:addTime
	 *
	 */
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date addTime;
	
	/**
	 * @Fields updateTime:updateTime
	 */
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;
	
	/**
	 * @Fields status:1启用，0禁用
	 */
	private Integer status;
	
	//columns END

	public AddrTask(){
	}

	public AddrTask(String id){
		this.id = id;
	}

	
	public void setId(String id){
		this.id = id;
	}
	
	public String getId(){
		return id;
	}
	
	public void setTaskName(String taskName){
		this.taskName = taskName;
	}
	
	public String getTaskName(){
		return taskName;
	}
	
	public void setTaskDesc(String taskDesc){
		this.taskDesc = taskDesc;
	}
	
	public String getTaskDesc(){
		return taskDesc;
	}
	
	public void setInterfaceId(String interfaceId){
		this.interfaceId = interfaceId;
	}
	
	public String getInterfaceId(){
		return interfaceId;
	}
	
	public void setFilePath(String filePath){
		this.filePath = filePath;
	}
	
	public String getFilePath(){
		return filePath;
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
	
	public void setStatus(Integer status){
		this.status = status;
	}
	
	public Integer getStatus(){
		return status;
	}


}