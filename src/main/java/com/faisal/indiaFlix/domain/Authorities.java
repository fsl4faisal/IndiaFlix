package com.faisal.indiaFlix.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Authorities {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	int id;
	
	@Column
	String username;
	
	@Column
	String authority;
	
	public Authorities(){}

	public Authorities(int id, String username, String authority) {
		super();
		this.id = id;
		this.username = username;
		this.authority = authority;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	
	
	
}
