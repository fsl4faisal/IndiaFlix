package com.faisal.indiaFlix.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.faisal.indiaFlix.domain.TvSeries;
@Repository
public interface TvSeriesDao {
	void add(TvSeries tvSeries);
	void edit(TvSeries tvSeries);
	void delete(int tvSeriesId);
	TvSeries getTvSeries(int tvSeriesId);
	List getAllTvSeries();
}
