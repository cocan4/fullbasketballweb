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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.finalBasketballWeb.fullbasketballweb.beans.Team;
import com.finalBasketballWeb.fullbasketballweb.service.TeamService;

@RestController
@RequestMapping("teams")
public class TeamController {

	@Autowired
	private TeamService teamService;

	@PostMapping("add")
	public ResponseEntity<?> addTeams(@RequestBody Team team) {
		try {
			teamService.updateTeam(team);
			return new ResponseEntity<>("Team updated succsesfully", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("cant add team", HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("update")
	public ResponseEntity<?> updateTeams(@RequestBody Team team) {
		try {
			teamService.addTeam(team);
			return new ResponseEntity<>("Team updated succsesfully", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("cant update team", HttpStatus.NO_CONTENT);
		}
	}

	@DeleteMapping("delete")
	public ResponseEntity<?> deleteTeams(@RequestBody Team team) {
		try {
			teamService.deleteTeam(team);
			return new ResponseEntity<>("Team deleted succsesfully", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("cant delete team", HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("get-all")
	public ResponseEntity<?> getAllTeams() {
		return new ResponseEntity<List<Team>>(teamService.getAllTeams(),HttpStatus.OK);
	}

	
	@GetMapping("get-single")
	public ResponseEntity<?>getOneTeam(@RequestParam(name = "id")int id){
		return new ResponseEntity<Team>(teamService.getOneTeam(id),HttpStatus.OK);
	}
	
	@GetMapping("get-single1/{id}")
	public ResponseEntity<?>getOneTeam1(@PathVariable(name = "id")int id){
		return new ResponseEntity<Team>(teamService.getOneTeam(id),HttpStatus.OK);
	}
}


