package com.jxd.bean;

/**
 * 管理原实体类
 */
public class Manage {
	private String manage_name;
	private String manage_password;
	
	public Manage() {
		super();
	}
	public Manage(String manage_name, String manage_password) {
		super();
		this.manage_name = manage_name;
		this.manage_password = manage_password;
	}
	public String getManage_name() {
		return manage_name;
	}
	public void setManage_name(String manage_name) {
		this.manage_name = manage_name;
	}
	public String getManage_password() {
		return manage_password;
	}
	public void setManage_password(String manage_password) {
		this.manage_password = manage_password;
	}
	
}
