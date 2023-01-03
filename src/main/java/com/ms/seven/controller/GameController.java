package com.ms.seven.controller;

import java.io.IOException;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.seven.model.Game;
import com.ms.seven.repository.GameRepo;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class GameController {
	
	@Autowired
	private GameRepo repo;
	
	@PostMapping("/addGame")
	public String saveGame(@RequestBody Game game) {
		repo.save(game);
		return "Added success";
	}
	

	
	@GetMapping("/findAllGames")
	public List<Game> getGames(){
		return repo.findAll();
	}
	

	
	@GetMapping("/currentGame")
	public JSONObject currentGames() throws IOException, ParseException {
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
			.url("https://api.football-data.org/v4/matches")
			.get()
			.addHeader("X-Auth-Token", "12c19fb5d72f4a6da0524e5bbbae8528")
			.build();

		
		Response response = client.newCall(request).execute();
		String res  = response.body().string();
		
		JSONParser parser = new JSONParser();  
		JSONObject json = (JSONObject) parser.parse(res);
		
		
		return json;
	}
	
	
}
