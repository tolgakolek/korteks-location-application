package com.kortekslab.location.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kortekslab.location.domain.Campus;

@Repository
public interface ICampusRepository extends JpaRepository<Campus, Long> {
	public Campus findFirstById(long id);
}
