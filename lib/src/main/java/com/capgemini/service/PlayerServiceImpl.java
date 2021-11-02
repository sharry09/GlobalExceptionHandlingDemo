package com.capgemini.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.capgemini.dao.PlayerDao;
import com.capgemini.model.Player;

@Service
@Scope(scopeName = "singleton")
public class PlayerServiceImpl implements PlayerService {
@Autowired
private PlayerDao dao=null;
    
    @Transactional
	@Override
	public Player addPlayer(Player player) {
		return dao.save(player);
		
	}

	

	

}
