package com.bill.billpayment.domain;

public class AdminLogin {

	private String userid;
	private String password;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public AdminLogin() {
		super();
	}
	public AdminLogin(String userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Adminlogin [userid=" + userid + ", password=" + password + "]";
	}
	
}
