package com.microservice.moviecatalogservice;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/getinfo")
public class MovieCatalogController {

	@RequestMapping("{name}")
	public UserInfo call(@PathVariable("name") String name) {
		RestTemplate rest = new RestTemplate();
		UserInfo userinfo = rest.getForObject("http://localhost:8081/"+name, UserInfo.class);
		return userinfo;
	}

}
