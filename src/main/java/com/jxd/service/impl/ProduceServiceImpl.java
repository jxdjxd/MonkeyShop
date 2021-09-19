package com.jxd.service.impl;

import java.util.List;

import com.jxd.bean.Produce;
import com.jxd.dao.ProduceDao;
import com.jxd.dao.impl.ProduceDaoImpl;
import com.jxd.service.ProduceService;

/**
 *	
 * @author jxd
 * @version 2021年4月10日
 *
 */
public class ProduceServiceImpl implements ProduceService {
	private ProduceDao produceDaoImpl = new ProduceDaoImpl();
	
	@Override
	public boolean add(Produce produce) {
		return produceDaoImpl.addProduce(produce);
	}

	@Override
	public boolean update(Produce produce) {
		return produceDaoImpl.modifyProduce(produce);
	}

	
	@Override
	public boolean delete(Produce produce) {
		return produceDaoImpl.delProduce(produce);
	}

	
	@Override
	public Produce getOne(Produce produce) {
		return produceDaoImpl.getProduce(produce);
	}

	@Override
	public List<Produce> getAll() {
		return produceDaoImpl.getAllProduce();
	}

}
