package com.adms.mglplanlv.dao.listlot.inpl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.mglplanlv.dao.listlot.ListLotDao;
import com.adms.mglplanlv.entity.ListLot;

@Repository("listLotDao")
public class ListLotDaoImpl extends GenericDaoHibernate<ListLot, Long> implements ListLotDao {

	public ListLotDaoImpl() {
		super(ListLot.class);
	}

}
