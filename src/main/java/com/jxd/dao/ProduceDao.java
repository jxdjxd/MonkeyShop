package com.jxd.dao;

import java.util.List;

import com.jxd.bean.Produce;
/**
 * 商品类接口
 *	
 * @author jxd
 * @version 2021.04.10
 *
 */
public interface ProduceDao {
	/**
	 * 查询出所有的商品
	 *  
	 * @return List<Produce>
	 */
	public List<Produce> getAllProduce();
	/**
	 * 增加商品
	 *  
	 * @param produce
	 * @return 商品是否增加成功
	 */
	public boolean addProduce(Produce produce);
	/**
	 * 删除商品
	 *  
	 * @param produce
	 * @return 商品是否删除成功
	 */
	public boolean delProduce(Produce produce);
	/**
	 * 修改商品信息
	 *  
	 * @param produce
	 * @return 商品是否修改成功
	 */
	public boolean modifyProduce(Produce produce);
	/**
	 * 查询一个商品
	 *  
	 * @param produce
	 * @return 查询结果
	 */
	public Produce getProduce(Produce produce);
	
	/**
	 * 
	 *  
	 * @param count 每一页的商品数量
	 * @return 商品总数和页数
	 */
	public int[] getTotalAndPageCount(int count);
	
	/**
	 * 
	 *  
	 * @param cpage 当前页数
	 * @param count 每一页的商品数量
	 * @return 切出的商品列表
	 */
	public List<Produce> getSection(int cpage, int count);
	
	
}
