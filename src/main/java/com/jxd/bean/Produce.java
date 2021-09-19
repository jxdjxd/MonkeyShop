package com.jxd.bean;
/**
 * 商品实体类
 *	
 * @author jxd
 * @version 2021.04.09
 *
 */
public class Produce {
	private String prd_id;
	private String prd_name;
	private String prd_class;
	private double prd_price;
	private int prd_stockQty;
	//设置商品图片的默认路径，如果商品为设置相对于项目的路径，则显示默认的error图片
	private String prd_path="img/prd_images/error.webp";
	
	
	public Produce(String prd_id, String prd_name, String prd_class,
			double prd_price, int prd_stockQty, String prd_path) {
		super();
		this.prd_id = prd_id;
		this.prd_name = prd_name;
		this.prd_class = prd_class;
		this.prd_price = prd_price;
		this.prd_stockQty = prd_stockQty;
		if(prd_path!=null){
			this.prd_path = prd_path;
		}
	}
	
	public Produce() {
		super();
	}
	
	@Override
	public String toString() {
		return "Produce [prd_id=" + prd_id + ", prd_name=" + prd_name
				+ ", prd_class=" + prd_class + ", prd_price=" + prd_price
				+ ", prd_stockQty=" + prd_stockQty + ", prd_path=" + prd_path
				+ "]";
	}

	public String getPrd_id() {
		return prd_id;
	}
	public void setPrd_id(String prd_id) {
		this.prd_id = prd_id;
	}
	public String getPrd_name() {
		return prd_name;
	}
	public void setPrd_name(String prd_name) {
		this.prd_name = prd_name;
	}
	public String getPrd_class() {
		return prd_class;
	}
	public void setPrd_class(String prd_class) {
		this.prd_class = prd_class;
	}
	public double getPrd_price() {
		return prd_price;
	}
	public void setPrd_price(double prd_price) {
		this.prd_price = prd_price;
	}
	public int getPrd_stockQty() {
		return prd_stockQty;
	}
	public void setPrd_stockQty(int prd_stockQty) {
		this.prd_stockQty = prd_stockQty;
	}
	public String getPrd_path() {
		return prd_path;
	}
	public void setPrd_path(String prd_path) {
		if(prd_path!=null){
			this.prd_path = prd_path;
		}
	}
	
	
}
