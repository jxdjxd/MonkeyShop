package com.jxd.test;

import org.junit.Test;

import com.jxd.utils.DBUtils;
/**
 * DBUtils的测试类
 *	
 * @author jxd
 * @version 
 *
 */
public class DBUtils_test {
	@Test
	public void test(){
		System.out.println(DBUtils.reserveGetConnection());
		System.out.println(DBUtils.getConnection());
	}
}
