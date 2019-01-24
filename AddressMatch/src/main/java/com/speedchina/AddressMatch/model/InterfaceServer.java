package com.speedchina.AddressMatch.model;



/**
 *
 * @Since 2010-2019
 * @Description: TODO
 * @author ***
 * @date 2019-01-22 11:53:55
 *
 */
public class InterfaceServer{

	
	//columns START
	/**
	 * @Fields id:id
	 */
	private String id;
	
	/**
	 * @Fields interfaceName:接口服务名称
	 */
	private String interfaceName;
	
	/**
	 * @Fields interfaceDesc:接口服务描述
	 */
	private String interfaceDesc;
	
	/**
	 * @Fields interfacePath:接口服务路径
	 */
	private String interfacePath;
	
	/**
	 * @Fields status:1启用，0禁用
	 */
	private Integer status;
	
	//columns END

	public InterfaceServer(){
	}

	public InterfaceServer(String id){
		this.id = id;
	}

	
	public void setId(String id){
		this.id = id;
	}
	
	public String getId(){
		return id;
	}
	
	public void setInterfaceName(String interfaceName){
		this.interfaceName = interfaceName;
	}
	
	public String getInterfaceName(){
		return interfaceName;
	}
	
	public void setInterfaceDesc(String interfaceDesc){
		this.interfaceDesc = interfaceDesc;
	}
	
	public String getInterfaceDesc(){
		return interfaceDesc;
	}
	
	public void setInterfacePath(String interfacePath){
		this.interfacePath = interfacePath;
	}
	
	public String getInterfacePath(){
		return interfacePath;
	}
	
	public void setStatus(Integer status){
		this.status = status;
	}
	
	public Integer getStatus(){
		return status;
	}


}