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
	public String username;
	@Column
	public String name;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	@Override
	public String toString() {
		return "Admin [username=" + username + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", contactNumber=" + contactNumber + ", adminId=" + adminId + ", password=" + password
				+ ", secretQuestion=" + secretQuestion + ", answer=" + answer + "]";
	}
	
}