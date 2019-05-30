package com.stackroute.spring.jdbc.service;

import com.stackroute.spring.jdbc.dao.MovieDAO;
import com.stackroute.spring.jdbc.model.Movie;
import org.springframework.transaction.annotation.Transactional;

public class MovieManagerImpl implements MovieManager {

	private MovieDAO movieDAO;

	public void setMovieDAO(MovieDAO movieDAO) {
		this.movieDAO = movieDAO;
	}

	@Transactional
	public void createCustomer(Movie movie) {
		movieDAO.create(movie);
	}

}
