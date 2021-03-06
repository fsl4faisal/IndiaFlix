package com.faisal.indiaFlix.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.faisal.indiaFlix.domain.Movies;

@Repository
public interface MoviesDao {
	void add(Movies movie);
	void edit(Movies movie);
	void delete(int movieId);
	Movies getMovie(int movieId);
	List getAllMovies();
}
