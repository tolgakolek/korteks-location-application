package com.kortekslab.location.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kortekslab.location.domain.Site;
import com.kortekslab.location.repositories.ISiteRepository;
import com.kortekslab.location.service.ISiteService;

@RestController
@RequestMapping("/site")
public class SiteController {
	private ISiteRepository siteRepository;
	private ISiteService siteService;

	public SiteController(ISiteRepository siteRepository, ISiteService siteService) {
		this.siteRepository = siteRepository;
		this.siteService = siteService;
	}

	@GetMapping("/list")
	public List<Site> getAll() {
		return siteService.findAll();
	}

	@GetMapping("/{id}")
	public Site getSite(@PathVariable int id) {
		return siteService.findFirstById(id);
	}

	@PostMapping("/")
	public Site addSite(@RequestBody Site site) {
		return siteService.addSite(site);
	}

	@PutMapping("/")
	public Site updateSite(@RequestBody Site site) {
		return siteService.updateSite(site);
	}

}
