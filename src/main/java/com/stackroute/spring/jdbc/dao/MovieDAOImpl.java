package com.stackroute.spring.jdbc.dao;

import javax.sql.DataSource;

import com.stackroute.spring.jdbc.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;

public class MovieDAOImpl implements MovieDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void create(Movie movie) {
		String queryCustomer = "insert into MOVIE (Movie_Id, Movie_Name,ReleaseYear,Rating) values (?,?,?,?)";
		String queryAddress = "insert into Actor (Lead_Actor, Lead_Actress,Movie_Id) values (?,?,?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(queryCustomer, new Object[] { movie.getMovie_Id(),
				movie.getMovie_name(),
		        movie.getReleaseYear(),
				movie.getRating()
		});
		System.out.println("Inserted into Movie Table Successfully");
		jdbcTemplate.update(queryAddress, new Object[] {
				movie.getActor().getLeadActor(),
				movie.getActor().getLeadActress(),movie.getMovie_Id(), });
		System.out.println("Inserted into Actor Table Successfully");
	}

}
