package com.microservice.moviecatalogservice;

import java.util.ArrayList;

public class UserInfo {
	String username;
	ArrayList<String> movienames;
	ArrayList<Integer> ratings;

	public UserInfo() {

	}

	public UserInfo(String username,ArrayList<String> movienames, ArrayList<Integer> ratings) {
		this.username=username;
		this.movienames = movienames;
		this.ratings = ratings;
	}

	public ArrayList<String> getMovienames() {
		return movienames;
	}

	public void setMovienames(ArrayList<String> movienames) {
		this.movienames = movienames;
	}

	public ArrayList<Integer> getRatings() {
		return ratings;
	}

	public void setRatings(ArrayList<Integer> ratings) {
		this.ratings = ratings;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	

}
