package com.bill.billpayment.domain;

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
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
@Entity
@Table(name = "Customers_details")
public class Customer 
{
	//for customer 2010
	@Id
	@SequenceGenerator(name = "custSequence",initialValue = 3030,allocationSize = 1,sequenceName = "CUSTOMER_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="custSequence")
	private int id;
	
   @Column(unique = true)
   @NotEmpty(message = "User Name should not  be empty")
	private String username;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	 @NotEmpty(message = "Password should not  be empty")
	private String password;
	@Column
	private String confirmationpassword;
	@Column(unique = true)
	@Email(message = "Invalid Email")
	private String email;
	@Column
     @Pattern(regexp = "[6789][0-9]{9}",message = "Invalid Mobile")
	private String mobile;
	@Column
	private String gender;
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
		@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
		@JoinColumn(name="s_no",referencedColumnName ="id")
		private Security1 security1;
		
		
		
		public Security1 getSecurity1() {
			return security1;
		}

		public void setSecurity1(Security1 sec) {
			this.security1 = sec;
		}

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getConfirmationpassword() {
		return confirmationpassword;
	}
	public void setConfirmationpassword(String confirmationpassword) {
		this.confirmationpassword = confirmationpassword;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Customer [id=" + id + ", username=" + username + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", password=" + password + ", confirmationpassword=" + confirmationpassword + ", email=" + email
				+ ", mobile=" + mobile + ", gender=" + gender + ", address=" + address + ", country=" + country
				+ ", state=" + state + ", secretquestion=" + secretquestion + ", answer=" + answer + ", security1="
				+ security1 + "]";
	}
	
	
	

		
}
	