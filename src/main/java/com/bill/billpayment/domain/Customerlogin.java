package com.bill.billpayment.domain;

import javax.validation.constraints.NotEmpty;

public class Customerlogin 
{

	@NotEmpty(message = "Not Empty")
	private String username;
	@NotEmpty(message = "Not Empty")
	private String password;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customerlogin [username=" + username + ", password=" + password + "]";
	}
	
}