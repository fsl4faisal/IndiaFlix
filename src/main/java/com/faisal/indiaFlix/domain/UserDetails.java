package com.faisal.indiaFlix.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;

@Entity
public class UserDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	int id;
	
	@Column
	String firstName;
	
	@Column
	String lastName;
	
	@Column
	String emailId;
	
	@Column
	String userType;
	
	public UserDetails(){}

	public UserDetails(int id, String firstName, String lastName, String emailId, String userType) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.userType = userType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	
}
