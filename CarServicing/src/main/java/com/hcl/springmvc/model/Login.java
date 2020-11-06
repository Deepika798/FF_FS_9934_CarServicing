package com.hcl.springmvc.model;

import javax.validation.constraints.NotEmpty;

/**
 * @author lingad2
 *
 */
public class Login {
	
	private int Id;

	private String password;
	/**
	 * 
	 */
	public Login() {
		super();
	}

	/**
	 * @param userId
	 * @param password
	 */
	public Login(  int Id,  String password) {
		super();
		this.Id = Id;
		this.password = password;
	}

	/**
	 * @return the userId
	 */
	public int getId() {
		return Id;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setId(int Id) {
		this.Id = Id;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Login [Id=" + Id + ", password=" + password + "]";
	}

}
