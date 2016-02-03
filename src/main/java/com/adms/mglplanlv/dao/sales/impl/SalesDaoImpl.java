package com.adms.mglplanlv.dao.sales.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.mglplanlv.dao.sales.SalesDao;
import com.adms.mglplanlv.entity.Sales;

@Repository("salesDao")
public class SalesDaoImpl extends GenericDaoHibernate<Sales, Long> implements SalesDao {

	public SalesDaoImpl() {
		super(Sales.class);
	}

}
