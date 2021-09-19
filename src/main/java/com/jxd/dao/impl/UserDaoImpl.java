package com.jxd.dao.impl;

import com.jxd.bean.Sys_user;
import com.jxd.dao.BaseDao;
import com.jxd.dao.UserDao;
import com.jxd.utils.DBUtils;
/**
 * sys_user的dao层实现类
 *	
 * @author jxd
 * @version 2021.3.29
 *
 */
public class UserDaoImpl extends BaseDao<Sys_user> implements UserDao {

	@Override
	public Sys_user getUserByUserNameAndPassword(Sys_user user) {
		String sql = "select * from sys_user where us_name=? and us_password=?";
		Sys_user u = (Sys_user)this.getBean(sql, user.getUs_name(), user.getUs_password());
		return u;
	}
	
	public int getMaxId(){
		return super.getMaxId("us_id", "sys_user");
	}
    
	/**
	 * 传入的user只需要有name、password、email属性即可
	 */
	@Override
	public boolean insertUser(Sys_user user) {
		if(!DBUtils.examineUserWithCartBalance()){
			System.out.println("请检查用户表和购物车表中的最大值是否相同");
			return false;
		}
		CartDaoImpl cart = new CartDaoImpl();
		String sql = "insert into sys_user(us_id, us_name, us_password, us_email, ca_id) values(?,?,?,?,?)";
		int id = this.getMaxId()+1;
		if (cart.insertCart(id)){
			int count = this.update(sql, id, user.getUs_name(), user.getUs_password(),user.getUs_email(), id);
			if (count>0) {
				return true;
			}else{
				return false;
			}
		}else{
			System.out.println("UserDaoImpl中的insertUser方法中向cart表中插入数据出错");
			return false;
		}
	}
	

	

}
