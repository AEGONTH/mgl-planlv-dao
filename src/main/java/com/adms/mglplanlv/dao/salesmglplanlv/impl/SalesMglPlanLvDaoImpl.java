package com.adms.mglplanlv.dao.salesmglplanlv.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.mglplanlv.dao.salesmglplanlv.SalesMglPlanLvDao;
import com.adms.mglplanlv.entity.SalesMglPlanLv;

@Repository("salesMglPlanLvDao")
public class SalesMglPlanLvDaoImpl extends GenericDaoHibernate<SalesMglPlanLv, Long> implements SalesMglPlanLvDao {

	public SalesMglPlanLvDaoImpl() {
		super(SalesMglPlanLv.class);
	}
	
}
