package com.hitriton.MicroS.domain;

import java.util.Set;


import javax.xml.bind.annotation.XmlRootElement;


//@XmlRootElement  // converts json output to xml format

public class Team {

	
	private String name;
	private String location;
	private String mascotte;
	
	
	Set <Players> players;

	public Team() {
		super();
	}

	public Team(String name, String location, Set<Players> players) {
		this();
		this.name = name;
		this.location = location;
		this.players = players;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getMascotte() {
		return mascotte;
	}


	public void setMascotte(String mascotte) {
		this.mascotte = mascotte;
	}


	public Set<Players> getPlayers() {
		return players;
	}


	public void setPlayers(Set<Players> players) {
		this.players = players;
	}
	
	
	
	
	
	

}
