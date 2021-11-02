package com.capgemini.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName="prototype")
@Entity
@Table(name = "PLAYERS")
public class Player {
	@Id
	@Column(name="PLAYER_NUMBER")
	private int jerseyNumber;
	
	@Column(name="PLAYER_NAME")
	private String playerName;
	public int getJerseyNumber() {
		return jerseyNumber;
	}
	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	@Override
	public String toString() {
		return "Players [jerseyNumber=" + jerseyNumber + ", playerName=" + playerName + "]";
	}

}
