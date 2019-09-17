package com.kortekslab.location.service;

import java.util.List;

import com.kortekslab.location.domain.Campus;

public interface ICampusService {
	public Campus addCampus(Campus campus);
	public Campus updateCampus(Campus campus);
	public List<Campus> findAll();
	public Campus findFirstById(int id);
}
