package com.kortekslab.location.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kortekslab.location.domain.Site;
import com.kortekslab.location.repositories.ISiteRepository;
import com.kortekslab.location.service.ISiteService;

@Service
public class SiteServiceImpl implements ISiteService {

	private final ISiteRepository siteRepository;

	public SiteServiceImpl(ISiteRepository siteRepository) {
		this.siteRepository = siteRepository;
	}

	@Override
	public Site addSite(Site site) {
		return siteRepository.save(site);
	}

	@Override
	public Site updateSite(Site site) {
		Site model = siteRepository.getOne(site.getId());
		if (model != null) {
			model.setName(site.getName());
			model.setDescription(site.getDescription());
			model.setGps(site.getGps());
			return siteRepository.save(model);
		} else {
			return null;
		}
	}

	@Override
	public List<Site> findAll() {
		return siteRepository.findAll();
	}

	@Override
	public Site findFirstById(int id) {
		return siteRepository.findFirstById(id);
	}

}
