package com.bill.billpayment.domain;

import java.text.SimpleDateFormat;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
@Entity
@Table(name = "vendors_details")
public class Vendor 
{
	//vendor details 
		@Id
		@SequenceGenerator(name = "vendor seq",initialValue = 3010,allocationSize = 1,sequenceName = "MESSAGE_SEQ")
		@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="messageSeq")
		private int id;
	
	@Column(unique = true)
	   @NotEmpty(message = "User Name should not  be empty")
	private String username;
	
	@Column(unique = true)
	   @NotEmpty(message = "company name should not  be empty")
	private String companyname;
	@Column(unique = true)
	   @NotEmpty(message = "companyregno should not  be empty")
	private String companyregno;
	
	@Column(unique = true)
	@Email(message = "Invalid Email")
	private String email;
	@Column
	@Pattern(regexp = "[6789][0-9]{9}",message = "Invalid Mobile")

	private String mobile;
	@Column
	private String website;

	@Column
	private Date cid;

	@Column
	private Date cvd;

	@Column
	private Date establishedyear;
	@Column(unique = true)
	   @NotEmpty(message = "password should not  be empty")
	private String password;
	@Column
	private String address;
	@Column
	private String country;
	@Column
	private String state;
	@Column
	private String secretquestion;
		@Column
	private String answer;
	
	
	@Column
    private String status;
	
	
	
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

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getCompanyregno() {
		return companyregno;
	}

	public void setCompanyregno(String companyregno) {
		this.companyregno = companyregno;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getSecretquestion() {
		return secretquestion;
	}

	public void setSecretquestion(String secretquestion) {
		this.secretquestion = secretquestion;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCid() {
		return cid;
	}

	public void setCid(String cid) {

		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		try {
		this.cid = dateformat.parse(cid);
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
		return "Vendor [id=" + id + ", username=" + username + ", companyname=" + companyname + ", companyregno="
				+ companyregno + ", email=" + email + ", mobile=" + mobile + ", website=" + website + ", cid=" + cid
				+ ", cvd=" + cvd + ", establishedyear=" + establishedyear + ", password=" + password + ", address="
				+ address + ", country=" + country + ", state=" + state + ", secretquestion=" + secretquestion
				+ ", answer=" + answer + ", status=" + status + "]";
	}

	

		


}
