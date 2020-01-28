package com.hitriton.MicroS.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hitriton.MicroS.domain.Team;

public interface TeamRepo extends CrudRepository<Team,Long> {
	
	List<Team> findAll();
	
	Team findByName(String name);

}
