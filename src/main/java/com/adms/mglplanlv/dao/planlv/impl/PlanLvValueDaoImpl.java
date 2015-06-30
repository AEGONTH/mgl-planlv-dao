package com.adms.mglplanlv.dao.planlv.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.mglplanlv.dao.planlv.PlanLvValueDao;
import com.adms.mglplanlv.entity.PlanLvValue;

@Repository("planLvValueDao")
public class PlanLvValueDaoImpl extends GenericDaoHibernate<PlanLvValue, Long> implements PlanLvValueDao {

	public PlanLvValueDaoImpl() {
		super(PlanLvValue.class);
	}

}
