package com.hitriton.MicroS.domain;

public class Players {
	
	private String name;
	private String position;
	
	
	public Players() {
		super();
		
	}
	
	public Players(String name, String position) {
		super();
		this.name = name;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	
	
}
