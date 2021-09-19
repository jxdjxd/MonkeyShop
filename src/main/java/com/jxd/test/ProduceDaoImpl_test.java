package com.jxd.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.jxd.bean.Produce;
import com.jxd.dao.impl.ProduceDaoImpl;
/**
 * ProduceDaoImpl类的测试类
 *	
 * @author jxd
 * @version 2021年4月9日
 *
 */
public class ProduceDaoImpl_test {
	ProduceDaoImpl produceDaoImpl = new ProduceDaoImpl();
	
	@Test
	public void testGetAllProduce(){
		List<Produce> produce_list = new ArrayList<Produce>();
		produce_list = produceDaoImpl.getAllProduce();
		for (Produce produce : produce_list) {
			System.out.println(produce);
		}
	}
	@Test
	public void testAddProduce(){
		Produce produce = new Produce();
		produce.setPrd_name("荔枝");
		produce.setPrd_class("食品");
		produce.setPrd_price(9.0);
		produce.setPrd_stockQty(100);
		System.out.println(produceDaoImpl.addProduce(produce));
	}
	@Test
	public void testDelProduce(){
		Produce produce = new Produce();
		produce.setPrd_id("1");
		System.out.println(produceDaoImpl.delProduce(produce));
	}
	@Test
	public void testModifyProduce(){
		Produce produce = new Produce();
		produce.setPrd_id("2");
		produce.setPrd_name("荔枝");
		produce.setPrd_class("食品");
		produce.setPrd_price(9.0);
		produce.setPrd_stockQty(1111);
		produce.setPrd_path(null);
		System.out.println(produceDaoImpl.modifyProduce(produce));
	}
	@Test
	public void testGetProduce(){
		Produce produce = new Produce();
		produce.setPrd_id("2");
		produce = produceDaoImpl.getProduce(produce);
		System.out.println(produce);
	}
	@Test
	public void testGetTotalAndPageCount(){
		int[] arr = produceDaoImpl.getTotalAndPageCount(5);
		System.out.println(Arrays.toString(arr));
	}
	
	@Test
	public void testGetSection(){
		List<Produce> list = produceDaoImpl.getSection(1, 5);
		System.out.println(list);
	}
	
}
