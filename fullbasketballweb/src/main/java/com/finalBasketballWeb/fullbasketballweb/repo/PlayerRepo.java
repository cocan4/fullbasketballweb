package com.finalBasketballWeb.fullbasketballweb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalBasketballWeb.fullbasketballweb.beans.Player;

public interface PlayerRepo extends JpaRepository<Player, Integer>{

}
