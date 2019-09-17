package com.kortekslab.location.service;

import java.util.List;

import com.kortekslab.location.domain.Site;

public interface ISiteService {
	public Site addSite(Site site);
	public Site updateSite(Site site);
	public List<Site> findAll();
	public Site findFirstById(int id);
}
