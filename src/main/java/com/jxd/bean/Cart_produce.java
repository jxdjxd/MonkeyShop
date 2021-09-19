package com.jxd.bean;
/**
 * 购物车商品实体类
 *	
 * @author jxd
 * @version 2021.3.28
 *
 */
public class Cart_produce {
	private String ca_id;
	private String prd_id;
	public Cart_produce(String ca_id, String prd_id) {
		super();
		this.ca_id = ca_id;
		this.prd_id = prd_id;
	}
	public Cart_produce() {
		super();
	}
	public String getCa_id() {
		return ca_id;
	}
	public void setCa_id(String ca_id) {
		this.ca_id = ca_id;
	}
	public String getPrd_id() {
		return prd_id;
	}
	public void setPrd_id(String prd_id) {
		this.prd_id = prd_id;
	}
	@Override
	public String toString() {
		return "cart_produce [ca_id=" + ca_id + ", prd_id=" + prd_id + "]";
	}
	
}
