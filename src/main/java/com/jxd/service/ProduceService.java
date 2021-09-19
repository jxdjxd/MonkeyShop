package com.jxd.service;

import java.util.List;

import com.jxd.bean.Produce;

/**
 *	
 * @author jxd
 * @version 2021年4月10日
 *
 */
public interface ProduceService {
	/**
	 *添加商品  
	 * @return 是否添加成功
	 */
	public boolean add(Produce produce);
	
	/**
	 * 修改商品信息
	 *  
	 * @param produce
	 * @return 是否修改成功
	 */
	public boolean update(Produce produce); 
	/**
	 * 删除商品
	 *  
	 * @param prodece
	 * @return 商品是否删除成功
	 */
	public boolean delete(Produce produce);
	/**
	 * 查询一个商品
	 *  
	 * @param produce
	 * @return 查出的商品
	 */
	public Produce getOne(Produce produce);
	/**
	 * 查询出所有的商品
	 *  
	 * @return
	 */
	public List<Produce> getAll();
}
