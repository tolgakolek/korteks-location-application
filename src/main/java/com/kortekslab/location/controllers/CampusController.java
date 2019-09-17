package com.kortekslab.location.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kortekslab.location.domain.Campus;
import com.kortekslab.location.repositories.ICampusRepository;
import com.kortekslab.location.service.ICampusService;

@RestController
@RequestMapping("/campus")
public class CampusController {
	private ICampusService campusService;
	private ICampusRepository campusRepository;

	public CampusController(ICampusService campusService, ICampusRepository campusRepository) {
		this.campusService = campusService;
		this.campusRepository = campusRepository;
	}

	@GetMapping("/list")
	public List<Campus> getAll() {
		return campusService.findAll();
	}

	@GetMapping("/{id}")
	public Campus getCampus(@PathVariable int id) {
		return campusService.findFirstById(id);
	}

	@PostMapping("/")
	public Campus addCampus(@RequestBody Campus campus) {
		return campusService.addCampus(campus);
	}

	@PutMapping("/")
	public Campus updateCampus(@RequestBody Campus campus) {
		return campusService.updateCampus(campus);
	}
}
