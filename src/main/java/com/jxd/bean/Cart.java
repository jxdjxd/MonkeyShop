package com.jxd.bean;

public class Cart {
	private String ca_id;

	public Cart() {
		super();
	}

	public Cart(String ca_id) {
		super();
		this.ca_id = ca_id;
	}

	@Override
	public String toString() {
		return "cart [ca_id=" + ca_id + "]";
	}

	public String getCa_id() {
		return ca_id;
	}

	public void setCa_id(String ca_id) {
		this.ca_id = ca_id;
	}
	

}
