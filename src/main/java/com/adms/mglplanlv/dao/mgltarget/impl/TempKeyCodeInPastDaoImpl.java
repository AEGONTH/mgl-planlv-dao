package com.adms.mglplanlv.dao.mgltarget.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.mglplanlv.dao.mgltarget.TempKeyCodeInPastDao;
import com.adms.mglplanlv.entity.TempKeyCodeInPast;

@Repository("tempKeyCodeInPastDao")
public class TempKeyCodeInPastDaoImpl extends GenericDaoHibernate<TempKeyCodeInPast, Long> implements TempKeyCodeInPastDao {

	public TempKeyCodeInPastDaoImpl() {
		super(TempKeyCodeInPast.class);
	}
	
}
