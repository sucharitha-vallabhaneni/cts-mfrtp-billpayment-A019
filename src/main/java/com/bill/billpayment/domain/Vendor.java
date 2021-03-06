package com.bill.billpayment.domain;

import java.text.SimpleDateFormat;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
@Entity
@Table(name = "vendors_details")
public class Vendor 
{
	//vendor details 
		@Id
		@SequenceGenerator(name = "vendorseq",initialValue = 3010,allocationSize = 1,sequenceName = "VEN_SEQ")
		@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="vendorseq")
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

	//@Temporal(TemporalType.DATE)
	@Column
	private Date cid;

	//@Temporal(TemporalType.DATE)
	@Column
	private Date cvd;
@Column
	private Date establishedyear;
	

	@Column(unique = true)
	   @NotEmpty(message = "password should not  be empty")
	private String password;
	@Column
	private String confirmationpassword;
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
	@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="s_no",referencedColumnName ="id")
	private Security security;
	
	
	
	public Security getSecurity() {
		return security;
	}

	public void setSecurity(Security security) {
		this.security = security;
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

	public String getCompanyname() {
		return companyname;
	}

	public String getConfirmationpassword() {
		return confirmationpassword;
	}

	public void setConfirmationpassword(String confirmationpassword) {
		this.confirmationpassword = confirmationpassword;
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
	public Date getEstablishedyear() {
		return establishedyear;
	}

	public void setEstablishedyear(Date establishedyear) {
		this.establishedyear = establishedyear;
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

	
	
	
	
	public Date getCvd() {
		return cvd;
	}

	public void setCvd(Date cvd) {
		this.cvd = cvd;
	}

	

	public void setCid(Date cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "Vendor [id=" + id + ", username=" + username + ", companyname=" + companyname + ", companyregno="
				+ companyregno + ", email=" + email + ", mobile=" + mobile + ", website=" + website + ", cid=" + cid
				+ ", cvd=" + cvd + ", establishedyear=" + establishedyear + ", password=" + password
				+ ", confirmationpassword=" + confirmationpassword + ", address=" + address + ", country=" + country
				+ ", state=" + state + ", secretquestion=" + secretquestion + ", answer=" + answer + ", status="
				+ status + ", security=" + security + "]";
	}

	
	

		


}
