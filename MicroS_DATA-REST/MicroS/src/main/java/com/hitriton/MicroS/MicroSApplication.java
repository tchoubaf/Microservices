package com.hitriton.MicroS;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hitriton.MicroS.Repository.TeamRepo;
import com.hitriton.MicroS.domain.Players;
import com.hitriton.MicroS.domain.Team;

@SpringBootApplication
public class MicroSApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroSApplication.class, args);
	}
	
	
	 @Autowired
	  TeamRepo	teamRepo;
	 
	 @PostConstruct
	 public void init() {
		 
		 Set<Players> players = new HashSet<>();
		 players.add(new Players("Messi", "striker"));
		 players.add(new Players("Fabrice", "keeper"));
		 
		Team  team = new Team ("Barcelona","Spain", players);
		teamRepo.save(team);
	 }
	 
	
	 
	 

}
