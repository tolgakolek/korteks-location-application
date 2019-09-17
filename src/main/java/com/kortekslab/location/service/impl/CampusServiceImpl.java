package com.kortekslab.location.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kortekslab.location.domain.Campus;
import com.kortekslab.location.repositories.ICampusRepository;
import com.kortekslab.location.service.ICampusService;

@Service
public class CampusServiceImpl implements ICampusService {
	private final ICampusRepository campusRepository;

	public CampusServiceImpl(ICampusRepository campusRepository) {
		this.campusRepository = campusRepository;
	}

	@Override
	public Campus addCampus(Campus campus) {
		return campusRepository.save(campus);
	}

	@Override
	public Campus updateCampus(Campus campus) {
		Campus model = campusRepository.getOne(campus.getId());
		if (model != null) {
			model.setName(campus.getName());
			// model.setState(campus.getState());
		} else {
			return null;
		}
		return campusRepository.save(model);
	}

	@Override
	public Campus findFirstById(int id) {
		return campusRepository.findFirstById(id);
	}

	@Override
	public List<Campus> findAll() {
		return campusRepository.findAll();
	}

}
