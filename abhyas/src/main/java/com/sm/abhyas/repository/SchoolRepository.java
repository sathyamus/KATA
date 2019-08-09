package com.sm.abhyas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sm.abhyas.model.School;

@Repository
public interface SchoolRepository extends JpaRepository<School, Integer> {
	
}
