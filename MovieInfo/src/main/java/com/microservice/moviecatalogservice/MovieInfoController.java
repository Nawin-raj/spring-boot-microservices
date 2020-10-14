package com.microservice.moviecatalogservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class MovieInfoController {
	@RequestMapping("{name}")
	public UserInfo getraing(@PathVariable("name") String name) {
		DataBase db = new DataBase();
		db.filldata();
		ArrayList<String> movies = db.map.get(name);
		RestTemplate rest = new RestTemplate();
		ArrayList<Integer> ratings = rest.getForObject(
				"http://localhost:8082/rating/" + movies.get(0) + "," + movies.get(1) + "," + movies.get(2),
				ArrayList.class);
		UserInfo user = new UserInfo();
		user.setUsername(name);
		user.setMovienames(movies);
		user.setRatings(ratings);
		return user;

	}

}
