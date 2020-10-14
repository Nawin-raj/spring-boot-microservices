package com.microservice.moviecatalogservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This controller has to receive list obj which contains movie names.
 * Using this obj we will iterate through the hashmap and fetch corresponding rating for movies.
 * We will return list of rating.
 * url: http://localhost:8082/rating/dhruva,naayak,orange
 * fot this my request mapping should be 
 * @RequestMapping("/rating/{name}") and pathvariable should be @PathVariable ArrayList<String> name
 *
 */
@RestController
public class RatingController {
	@RequestMapping("/rating/{name}")
	public ArrayList<Integer> getraing(@PathVariable("name") ArrayList<String> list) {
		
		
		ArrayList<Integer> rating_output = new ArrayList();
		//Build ratings to movies
		RatingDb rating = new RatingDb();
		rating.initilizeratingdata();
		for (int i = 0; i < list.size(); i++) {
			rating_output.add(rating.map.get(list.get(i)));

		}
		
		return rating_output;

	}

}
