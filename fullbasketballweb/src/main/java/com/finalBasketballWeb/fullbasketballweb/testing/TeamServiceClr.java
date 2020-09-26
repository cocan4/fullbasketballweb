package com.finalBasketballWeb.fullbasketballweb.testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.finalBasketballWeb.fullbasketballweb.beans.Team;
import com.finalBasketballWeb.fullbasketballweb.service.TeamService;
import com.finalBasketballWeb.fullbasketballweb.utils.ArtUtils;

@Component
@Order(1)
public class TeamServiceClr implements CommandLineRunner {

	@Autowired
	private TeamService teamService;

	@Override
	public void run(String... args) throws Exception {

		System.out.println(ArtUtils.TEAM_SERVICE_ART);
		System.out.println();
		System.out.println(ArtUtils.ADD_TEAMS);

		Team t1 = new Team();
		t1.setName("MIAMI-HEAT");
		t1.setId(1);
		t1.setCity("miami");
		t1.setProffesion("basketball");
		teamService.addTeam(t1);

		Team t2 = new Team();
		t2.setName("INDIANA-PACERS");
		t2.setCity("indiana");
		t2.setId(2);
		t2.setProffesion("basketball");
		teamService.addTeam(t2);

		Team t3 = new Team();
		t3.setName("LA-LAKERS");
		t3.setCity("las angeles");
		t3.setId(3);
		t3.setProffesion("basketball");
		teamService.addTeam(t3);

		Team t4 = new Team();
		t4.setName("CHICAGO-BULLS");
		t4.setCity("chicago");
		t4.setId(4);
		t4.setProffesion("basketball");
		teamService.addTeam(t4);

		Team t5 = new Team();
		t5.setName("BOSTON-CELTICS");
		t5.setCity("boston");
		t5.setId(5);
		t5.setProffesion("basketball");
		teamService.addTeam(t5);
		System.out.println(teamService.getAllTeams());

		System.out.println(ArtUtils.UPDATE_TEAMS);
		t5.setProffesion("Basketball");
		teamService.updateTeam(t5);
		System.out.println(teamService.getAllTeams());

		System.out.println(ArtUtils.DELETE_TEAMS);
		teamService.deleteTeam(t5);
		System.out.println(teamService.getAllTeams());

		System.out.println(ArtUtils.GET_ONE_TEAM);
		System.out.println(teamService.getOneTeam(1));

		System.out.println(ArtUtils.GET_ALL_TEAMS);
		System.out.println(teamService.getAllTeams());

	}

}
