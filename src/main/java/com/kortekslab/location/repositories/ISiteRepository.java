package com.kortekslab.location.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kortekslab.location.domain.Site;

@Repository
public interface ISiteRepository extends JpaRepository<Site, Integer> {
	public Site findFirstById(int id);
}
