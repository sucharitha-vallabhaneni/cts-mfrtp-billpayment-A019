package com.bill.billpayment.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dthgpay_details")
public class Dthgpay 
{

	@Id
	@Column
	
private String contactNumber;
	@Column
	private String upi;
	@Column
	private String password;
	
	

	public String getUpi() {
		return upi;
	}

	public void setUpi(String upi) {
		this.upi = upi;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Gpay [contactNumber=" + contactNumber + ", upi=" + upi + ", password=" + password + "]";
	}
	
	

	
}


