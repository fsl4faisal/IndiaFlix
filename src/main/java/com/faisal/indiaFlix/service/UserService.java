package com.faisal.indiaFlix.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.faisal.indiaFlix.domain.UserDetails;

@Service
public interface UserService {
	void add(UserDetails user);
	void edit(UserDetails user);
	void delete(int userId);
	UserDetails getUserDetails(int userId);
	List getAllUsers();
}
