package com.bill.billpayment.domain;

public class Adminlogin {

	private String username;
	@Override
	public String toString() {
		return "Adminlogin [username=" + username + ", password=" + password + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	private String password;
		public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Adminlogin() {
		super();
	}
		
}
