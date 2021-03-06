package com.faisal.indiaFlix.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.faisal.indiaFlix.domain.Movies;

@Service
public interface MoviesService {
	void add(Movies movie);
	void edit(Movies movie);
	void delete(int movieId);
	Movies getMovie(int movieId);
	List getAllMovies();
}
