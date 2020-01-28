package com.hitriton.MicroS;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hitriton.MicroS.domain.Players;
import com.hitriton.MicroS.domain.Team;


//@org.springframework.stereotype.Controller // using a Controller and Response Body with example 1 & 2 below

@RestController
public class Controller {

	// example 1: classpath using webpage
//	@RequestMapping("/hi")
//  public @ResponseBody String hiThere() {
//	  return "Hi Fabrice !";
//  }
	
	
	// example 2: classpath using Thymeleaf
//	@RequestMapping("/hi/{name}")
//	  public String hiThere (Map model, @PathVariable String name) {
//		
//		model.put("name", name);
//		
//		  return "Hello";
//	  }
	
	
	 private Team team; // initialize the team object down
	 
	 @PostConstruct
	 public void init() {
		 
		 Set<Players> players = new HashSet<>();
		 players.add(new Players("Messi", "striker"));
		 players.add(new Players("Fabrice", "keeper"));
		 
		 team = new Team ("Barcelona","Spain", players);
		 
		 
	 }
	 
	@RequestMapping("/hi")
	  public Team hiThere () {

		  return team;
	  }
	
}
