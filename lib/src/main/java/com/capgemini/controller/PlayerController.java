package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.exception.InsufficientDataException;

import com.capgemini.model.Player;
import com.capgemini.service.PlayerService;

@RestController
@RequestMapping(path="players")
public class PlayerController {
@Autowired
private PlayerService service=null;

@PostMapping
public Player savePlayer(@RequestBody Player player) throws InsufficientDataException {
	if(player.getPlayerName().isEmpty() || player.getJerseyNumber() == 0) {
		throw new InsufficientDataException("Provide Valid Data");
	}
	 return service.addPlayer(player);
	 }


}
