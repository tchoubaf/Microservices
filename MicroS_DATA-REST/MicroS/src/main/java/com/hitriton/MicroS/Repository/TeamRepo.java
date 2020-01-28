package com.hitriton.MicroS.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.hitriton.MicroS.domain.Team;

//in data-rest with @ResResource you do not need a controller anymore
@RestResource(path="teams", rel="team") // the past replaces @RequestMapping, and rel = creates a hyperlink
public interface TeamRepo extends CrudRepository<Team,Long> {
	
	List<Team> findAll();
	
	Team findByName(String name);

}
