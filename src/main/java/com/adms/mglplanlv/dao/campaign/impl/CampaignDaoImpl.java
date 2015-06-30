package com.adms.mglplanlv.dao.campaign.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.mglplanlv.dao.campaign.CampaignDao;
import com.adms.mglplanlv.entity.Campaign;

@Repository("campaignDao")
public class CampaignDaoImpl extends GenericDaoHibernate<Campaign, Long> implements CampaignDao {

	public CampaignDaoImpl() {
		super(Campaign.class);
	}
	
}
