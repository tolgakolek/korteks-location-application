package com.kortekslab.location.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kortekslab.location.domain.Block;

@Repository
public interface IBlockRepository extends JpaRepository<Block, Long> {
	public Block findFirstById(long id);
}
