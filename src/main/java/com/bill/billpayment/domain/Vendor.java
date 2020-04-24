package com.bill.billpayment.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "vendor_details")
public class Vendor 
{
	@Id
	@Generated("assigned")
	private String username;
	
	@Column
	private String companyname;
	@Column
	private String lastname;
	@Column
	private String companyregno;
	@Column
	private String password;
	@Column
	private String Address;
	@Column
	private String country;
	@Column
	private String state;

	@Column(unique = true)
	private String email;
	@Column
	private String mobile;
	@Column
	private String website;

	@Column
	private Date Cid;

	@Column
	private Date cvd;

	@Column
	private Date establishedyear;
	@Column
    private String status;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUsername() {
		return username;
	}

		public void setUsername(String username) {
		this.username = username;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCompanyregno() {
		return companyregno;
	}

	public void setCompanyregno(String companyregno) {
		this.companyregno = companyregno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Date getCid() {
		return Cid;
	}

	public void setCid(String Cid) {

		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		try {
		this.Cid = dateformat.parse(Cid);
		}catch (Exception e) {

e.printStackTrace();
		}
		
	}

	public Date getCvd() {
		return cvd;
	}

	public void setCvd(String cvd) {
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		try {
		this.cvd = dateformat.parse(cvd);
		}catch (Exception e) {

e.printStackTrace();
		}

	}

	public Date getEstablishedyear() {
		return establishedyear;
	}

	public void setEstablishedyear(String establishedyear) {
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		try {
		this.establishedyear = dateformat.parse(establishedyear);
		}catch (Exception e) {

e.printStackTrace();
		}

	}

	@Override
	public String toString() {
		return "Vendor [username=" + username + ", companyname=" + companyname + ", lastname=" + lastname
				+ ", companyregno=" + companyregno + ", password=" + password + ", Address=" + Address + ", country="
				+ country + ", state=" + state + ", email=" + email + ", mobile=" + mobile + ", website=" + website
				+ ", Cid=" + Cid + ", cvd=" + cvd + ", establishedyear=" + establishedyear + ", status=" + status + "]";
	}
	


}
