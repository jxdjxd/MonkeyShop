package com.jxd.dao.impl;

import com.jxd.dao.BaseDao;
import com.jxd.dao.CartDao;

import com.jxd.bean.Cart;


/**
 * cart的dao层实现类
 *	
 * @author jxd
 * @version 2021.3.29
 *
 */
public class CartDaoImpl extends BaseDao<Cart> implements CartDao {

	@Override
	public boolean insertCart(int ca_id) {
		String sql = "insert into cart values(?)";
		int count = this.update(sql, ca_id);
		return count>0;
	}
	
	public int getMaxId(){
		return super.getMaxId("ca_id", "cart");
	}

}
