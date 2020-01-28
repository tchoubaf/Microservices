package com.hitriton.MicroS;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hitriton.MicroS.Repository.TeamRepo;

import com.hitriton.MicroS.domain.Team;


@RestController
public class Controller {


	@Autowired
	  TeamRepo teamRepo;
	 
	
	 
	@RequestMapping("/teams/{name}")
	  public Team hiThere(@PathVariable String name) {

		  return teamRepo.findByName(name);
	  }
	
}
