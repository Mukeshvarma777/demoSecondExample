package com.example.demoSecondExample.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demoSecondExample.entity.Alien;

public interface AlienRepo extends JpaRepository<Alien,Integer>{
	
	List<Alien> findByTech(String tech);
	
	List<Alien> findByAidGreaterThan(int id);
	

	

}