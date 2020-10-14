package com.microservice.moviecatalogservice;

import java.util.HashMap;

public class RatingDb {
	HashMap<String, Integer> map;
	public void initilizeratingdata() {
		 map = new HashMap();
		map.put("dhruva", 10);
		map.put("naayak", 9);
		map.put("orange", 9);
		map.put("a", 10);
		map.put("b", 8);
		map.put("c", 6);
		map.put("x", 7);
		map.put("y", 8);
		map.put("z", 9);

	}

}
