package com.bill.billpayment.domain;


import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {

	@Id
	@Generated("assigned")
	@Column
	public String firstname;
	@Column
	public String lastname;
	@Column
	public String age;
	@Column
	public String gender;
	@Column
	public String contactNumber;
	@Column
	public String adminId;
	@Column
	public String password;
	@Column
	public String secretQuestion;
	@Column
	public String answer;
	
	public Admin(String firstname, String lastname, String age, String gender, String contactNumber, String adminId,
			String password, String secretQuestion, String answer) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.adminId = adminId;
		this.password = password;
		this.secretQuestion = secretQuestion;
		this.answer = answer;
	}
	public String getSecretQuestion() {
		return secretQuestion;
	}
	public void setSecretQuestion(String secretQuestion) {
		this.secretQuestion = secretQuestion;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Admin() {
		super();
	}
	@Override
	public String toString() {
		return "Admin [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", gender=" + gender
				+ ", contactNumber=" + contactNumber + ", adminId=" + adminId + ", password=" + password
				+ ", secretQuestion=" + secretQuestion + ", answer=" + answer + "]";
	}
	
	
	
	
}
