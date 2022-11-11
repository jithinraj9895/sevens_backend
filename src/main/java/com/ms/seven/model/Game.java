package com.ms.seven.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;





@Document("Game")
public class Game {

	
	@Id private int id;
	private String teamName1;
	private String teamName2;
	
	
	public Game(int id, String teamName1, String teamName2) {
		super();
		this.id = id;
		this.teamName1 = teamName1;
		this.teamName2 = teamName2;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeamName1() {
		return teamName1;
	}
	public void setTeamName1(String teamName1) {
		this.teamName1 = teamName1;
	}
	public String getTeamName2() {
		return teamName2;
	}
	public void setTeamName2(String teamName2) {
		this.teamName2 = teamName2;
	}
	

	
}
