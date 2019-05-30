package com.stackroute.spring.jdbc.model;

import java.net.DatagramPacket;

public class Movie {


	private int Movie_Id;
	private String Movie_name;
	private int ReleaseYear;
	private float Rating;
	Actor actor;

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public int getMovie_Id() {
		return Movie_Id;
	}

	public void setMovie_Id(int movie_Id) {
		Movie_Id = movie_Id;
	}

	public String getMovie_name() {
		return Movie_name;
	}

	public void setMovie_name(String movie_name) {
		Movie_name = movie_name;
	}

	public int getReleaseYear() {
		return ReleaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		ReleaseYear = releaseYear;
	}

	public float getRating() {
		return Rating;
	}

	public void setRating(float rating) {
		Rating = rating;
	}


}
