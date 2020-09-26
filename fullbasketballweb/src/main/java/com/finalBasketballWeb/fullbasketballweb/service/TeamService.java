package com.finalBasketballWeb.fullbasketballweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalBasketballWeb.fullbasketballweb.beans.Team;
import com.finalBasketballWeb.fullbasketballweb.repo.TeamRepo;

@Service
public class TeamService {

	@Autowired
	private TeamRepo teamRepo;

	public void addTeam(Team team) {
		teamRepo.save(team);

	}

	public void updateTeam(Team team) {
		teamRepo.saveAndFlush(team);
	}

	public void deleteTeam(Team team) {
		teamRepo.delete(team);
	}

	public List<Team> getAllTeams() {
		return teamRepo.findAll();
	}

	public Team getOneTeam(int id) {
		return teamRepo.getOne(id);
	}
}
