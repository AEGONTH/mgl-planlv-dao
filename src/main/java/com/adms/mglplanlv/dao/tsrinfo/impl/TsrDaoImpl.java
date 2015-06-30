package com.adms.mglplanlv.dao.tsrinfo.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.mglplanlv.dao.tsrinfo.TsrDao;
import com.adms.mglplanlv.entity.Tsr;

@Repository("tsrDao")
public class TsrDaoImpl extends GenericDaoHibernate<Tsr, Long> implements TsrDao {

	public TsrDaoImpl() {
		super(Tsr.class);
	}
	
}
