package com.security.model;

import java.io.Serializable;

public class UserDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2236988728816138203L;
	private User user;
	private String token;

	public UserDTO(User user, String token) {
		super();
		this.user = user;
		this.token = token;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
