package com.jxd.bean;
/**
 * 用户实体类
 *	
 * @author jxd
 * @version 2021.3.28
 *
 */
public class Sys_user {
	private String us_id;
	private String us_name;
	private String us_password;
	private String us_sex;
	private String us_birthday;
	private String us_email;
	private String us_mobile;
	private String us_address;
	private String us_identity;
	private String ca_id;
	
	public Sys_user() {
		super();
	}
	public Sys_user(String us_id, String us_name, String us_password,
			String us_sex, String us_birthday, String us_email,
			String us_mobile, String us_address, String us_identity,
			String ca_id) {
		super();
		this.us_id = us_id;
		this.us_name = us_name;
		this.us_password = us_password;
		this.us_sex = us_sex;
		this.us_birthday = us_birthday;
		this.us_email = us_email;
		this.us_mobile = us_mobile;
		this.us_address = us_address;
		this.us_identity = us_identity;
		this.ca_id = ca_id;
	}
	
	@Override
	public String toString() {
		return "sys_user [us_id=" + us_id + ", us_name=" + us_name
				+ ", us_password=" + us_password + ", us_sex=" + us_sex
				+ ", us_birthday=" + us_birthday + ", us_email=" + us_email
				+ ", us_mobile=" + us_mobile + ", us_address=" + us_address
				+ ", us_identity=" + us_identity + ", ca_id=" + ca_id + "]";
	}
	public String getUs_id() {
		return us_id;
	}
	public void setUs_id(String us_id) {
		this.us_id = us_id;
	}
	public String getUs_name() {
		return us_name;
	}
	public void setUs_name(String us_name) {
		this.us_name = us_name;
	}
	public String getUs_password() {
		return us_password;
	}
	public void setUs_password(String us_password) {
		this.us_password = us_password;
	}
	public String getUs_sex() {
		return us_sex;
	}
	public void setUs_sex(String us_sex) {
		this.us_sex = us_sex;
	}
	public String getUs_birthday() {
		return us_birthday;
	}
	public void setUs_birthday(String us_birthday) {
		this.us_birthday = us_birthday;
	}
	public String getUs_email() {
		return us_email;
	}
	public void setUs_email(String us_email) {
		this.us_email = us_email;
	}
	public String getUs_mobile() {
		return us_mobile;
	}
	public void setUs_mobile(String us_mobile) {
		this.us_mobile = us_mobile;
	}
	public String getUs_address() {
		return us_address;
	}
	public void setUs_address(String us_address) {
		this.us_address = us_address;
	}
	public String getUs_identity() {
		return us_identity;
	}
	public void setUs_identity(String us_identity) {
		this.us_identity = us_identity;
	}
	public String getCa_id() {
		return ca_id;
	}
	public void setCa_id(String ca_id) {
		this.ca_id = ca_id;
	}
	
}
