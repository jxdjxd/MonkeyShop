package com.jxd.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.jxd.bean.Produce;
import com.jxd.dao.BaseDao;
import com.jxd.dao.ProduceDao;
import com.jxd.utils.DBUtils;
/**
 * Produce的实现类
 *	
 * @author jxd
 * @version 2021年4月9日
 *
 */
public class ProduceDaoImpl extends BaseDao<Produce> implements ProduceDao {

	@Override
	public List<Produce> getAllProduce() {
		String sql = "select * from Produce";
		return getBeanList(sql);
	}

	@Override
	public boolean addProduce(Produce produce) {
		String sql = "insert into produce(prd_name,prd_class,prd_price,prd_stockQty,prd_path)"
				+ "values (?,?,?,?,?)";
		int count= update(sql, produce.getPrd_name(),produce.getPrd_class(),produce.getPrd_price(),produce.getPrd_stockQty(),produce.getPrd_path());
		return count>0;
	}

	@Override
	public boolean delProduce(Produce produce) {
		String sql = "delete from produce where prd_id=?";
		int count = update(sql, produce.getPrd_id());
		return count>0;
	}

	@Override
	public boolean modifyProduce(Produce produce) {
		String sql = "update produce set "
				+ "prd_name=?, prd_class=?,"
				+ "prd_price=?, prd_stockQty=?,"
				+ "prd_path=? "
				+ "where prd_id=?";
		int count = update(sql, produce.getPrd_name(), produce.getPrd_class(),
				    produce.getPrd_price(), produce.getPrd_stockQty(),
				    produce.getPrd_path(), produce.getPrd_id());
		return count>0;
	}

	@Override
	public Produce getProduce(Produce produce) {
		String sql = "select * from produce where prd_id=?";
		return this.getBean(sql, produce.getPrd_id());
	}

	@Override
	public int[] getTotalAndPageCount(int count) {
		int arr[] = {0, 1};
		String sql = "select count(*) from produce";
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		
		try{
			conn = DBUtils.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				arr[0]= rs.getInt(1);
				if(arr[1]%count==0){
					arr[1]= (arr[0]/count);
				}else{
					arr[1]= (arr[0]/count)+1;
				}
			}
		}catch(Exception e){
			System.out.println("ProduceDaoImpl方法中的getTotalAndPageCount方法有问题");
			e.printStackTrace();
		}finally{
			DBUtils.closeConnAndPs(conn, ps);
		}
		return arr;
	}

	@Override
	public List<Produce> getSection(int cpage, int count) {
		String sql = "select * from produce order by prd_id limit ?,?";
		return getBeanList(sql,(cpage-1)*count,count);
	}

}
