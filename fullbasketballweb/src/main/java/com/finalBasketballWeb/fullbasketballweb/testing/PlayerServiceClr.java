package com.finalBasketballWeb.fullbasketballweb.testing;

import java.sql.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.finalBasketballWeb.fullbasketballweb.beans.Player;
import com.finalBasketballWeb.fullbasketballweb.exceptions.NotAllowedException;
import com.finalBasketballWeb.fullbasketballweb.service.PlayerService;
import com.finalBasketballWeb.fullbasketballweb.service.TeamService;
import com.finalBasketballWeb.fullbasketballweb.utils.ArtUtils;

@Component
@Order(2)
public class PlayerServiceClr implements CommandLineRunner {

	@Autowired
	private PlayerService playerService;

	@Autowired
	private TeamService teamService;

	@Override
	public void run(String... args) throws Exception {
	
		System.out.println(ArtUtils.PLAYER_SERVICE_ART);
		System.out.println(ArtUtils.ADD_PLAYERS);

		Player p1 = new Player(1, Date.valueOf("1981-08-21"), "ray allen", "33", "basketball", "sg",
				teamService.getOneTeam(1));
		Player p2 = new Player(2, Date.valueOf("1981-08-21"), "reggie miller", "basketball", "basketball", "sg",
				teamService.getOneTeam(2));
		Player p3 = new Player(3, Date.valueOf("1981-06-21"), "koby bryent", "8", "basketball", "sg",
				teamService.getOneTeam(3));
		Player p4 = new Player(4, Date.valueOf("1981-06-21"), "scotty pippen", "33", "basketball", "sf",
				teamService.getOneTeam(4));
		Player p5 = new Player(5, Date.valueOf("1981-06-21"), "shaquile oniel", "32", "basketball", "c",
				teamService.getOneTeam(3));
		Player p6 = new Player(6, Date.valueOf("1981-06-21"), "michael jordan", "23", "basketball", "sg",
				teamService.getOneTeam(4));
		Player p7 = new Player(7, Date.valueOf("1981-06-21"), "dwayne wade", "3", "basketball", "sg",
				teamService.getOneTeam(1));
		Player p8 = new Player(8, Date.valueOf("1981-06-21"), "magic johnson", "32", "basketball", "pg",
				teamService.getOneTeam(3));
		Player p9 = new Player(9, Date.valueOf("1981-06-21"), "chris bosh", "1", "basketball", "pf",
				teamService.getOneTeam(1));
		Player p10 = new Player(10, Date.valueOf("1981-06-21"), "jalen rose", "6", "basketball", "sf",
				teamService.getOneTeam(2));
		Player p11 = new Player(11, Date.valueOf("1981-06-21"), "lebron james", "23", "basketball", "sf",
				teamService.getOneTeam(1));
		Player p12 = new Player(12, Date.valueOf("1981-06-21"), "lebron james", "23", "basketball", "sf",
				teamService.getOneTeam(1));
		
		playerService.addPlayers(p1);
		playerService.addPlayers(p2);
		playerService.addPlayers(p3);
		playerService.addPlayers(p4);
		playerService.addPlayers(p5);
		playerService.addPlayers(p6);
		playerService.addPlayers(p7);
		playerService.addPlayers(p8);
		playerService.addPlayers(p9);
		playerService.addPlayers(p10);
		playerService.addPlayers(p11);
		try {
			playerService.addPlayers(p12);
		} catch (NotAllowedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(playerService.getAllPlayers());
		
		System.out.println(ArtUtils.UPDATE_PLAYERS);
		p3.setShirtNum("24");
		System.out.println(playerService.getAllPlayers());
		
		System.out.println(ArtUtils.DELETE_PLAYERS);
		Player p13 = new Player(13, Date.valueOf("1981-06-21"), "BLA BLA", "23", "basketball", "sf",
				teamService.getOneTeam(2));
		playerService.addPlayers(p13);
		playerService.deletePlayers(p13);
		System.out.println(playerService.getAllPlayers());
		
		System.out.println(ArtUtils.GET_ONE_PLAYER);
		System.out.println(playerService.getPlayer(6));
		
		System.out.println(ArtUtils.GET_ALL_PLAYERS);
		System.out.println(playerService.getAllPlayers());
	}

}
