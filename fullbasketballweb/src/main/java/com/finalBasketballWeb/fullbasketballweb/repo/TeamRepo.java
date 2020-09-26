package com.finalBasketballWeb.fullbasketballweb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalBasketballWeb.fullbasketballweb.beans.Team;

public interface TeamRepo extends JpaRepository<Team, Integer>{

}
