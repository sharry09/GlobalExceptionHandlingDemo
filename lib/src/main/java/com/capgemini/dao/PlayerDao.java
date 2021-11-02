package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.model.Player;

@Repository
public interface PlayerDao extends JpaRepository<Player, Integer> {

}
