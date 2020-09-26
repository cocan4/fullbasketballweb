package com.finalBasketballWeb.fullbasketballweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finalBasketballWeb.fullbasketballweb.beans.Player;
import com.finalBasketballWeb.fullbasketballweb.service.PlayerService;

@RestController
@RequestMapping("players")
public class PlayerController {

	@Autowired
	private PlayerService playerService;

	@PostMapping("add")
	public ResponseEntity<?> addPlayers(@RequestBody Player player) {
		try {
			playerService.addPlayers(player);
			return new ResponseEntity<>("Player added succsesfully", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("cant add player", HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("update")
	public ResponseEntity<?> updatePlayers(@RequestBody Player player) {
		try {
			playerService.addPlayers(player);
			return new ResponseEntity<>("Player updated succsesfully", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("cant update player", HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("delete")
	public ResponseEntity<?> deletePlayers(@RequestBody Player player) {
		try {
			playerService.deletePlayers(player);
			return new ResponseEntity<>("Player deleted succsesfully", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("cant delete player", HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("get-all")
	public ResponseEntity<?> getAllPlayers() {
		return new ResponseEntity<List<Player>>(playerService.getAllPlayers(), HttpStatus.OK);
	}

	@GetMapping("get-single/{id}")
	public ResponseEntity<?> getOneTeam(@PathVariable(name = "id") int id) {
		return new ResponseEntity<Player>(playerService.getPlayer(id), HttpStatus.OK);
	}

	@GetMapping("get-single1")
	public ResponseEntity<?> getOneTeam1(@PathVariable(name = "id") int id) {
		return new ResponseEntity<Player>(playerService.getPlayer(id), HttpStatus.OK);
	}

}
