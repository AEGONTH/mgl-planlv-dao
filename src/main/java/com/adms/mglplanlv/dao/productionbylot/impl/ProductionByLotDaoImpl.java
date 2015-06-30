package com.adms.mglplanlv.dao.productionbylot.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.mglplanlv.dao.productionbylot.ProductionByLotDao;
import com.adms.mglplanlv.entity.ProductionByLot;

@Repository("productionByLotDao")
public class ProductionByLotDaoImpl extends GenericDaoHibernate<ProductionByLot, Long> implements ProductionByLotDao {

	public ProductionByLotDaoImpl() {
		super(ProductionByLot.class);
	}
	
}
