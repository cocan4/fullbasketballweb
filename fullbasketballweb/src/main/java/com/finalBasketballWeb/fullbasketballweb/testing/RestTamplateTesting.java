package com.finalBasketballWeb.fullbasketballweb.testing;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.finalBasketballWeb.fullbasketballweb.beans.Player;
import com.finalBasketballWeb.fullbasketballweb.service.TeamService;

@Component
public class RestTamplateTesting implements CommandLineRunner {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private TeamService teamService;
	
	@Override
	public void run(String... args) throws Exception {

		Player p1 = new Player(12, Date.valueOf("1980-05-29"), "larry bird", "32", "basketball", "sf",
				teamService.getOneTeam(3));
		System.out.println(restTemplate.postForEntity("http://localhost:8080/players/add", p1, String.class));
		


	}
}
