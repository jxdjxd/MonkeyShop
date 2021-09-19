package com.jxd.test;

import org.junit.Test;

import com.jxd.dao.impl.CartDaoImpl;
/**
 * CartDaoImpl的测试类
 *	
 * @author jxd
 * @version 2021.3.29
 *
 */
public class CartDaoImpl_test {
	
	CartDaoImpl cart = new CartDaoImpl();
	@Test
	public void test(){
		System.out.println(cart.insertCart(2));
	}
}
