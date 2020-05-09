package com.bill.billpayment.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="security1")
public class Security1 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
    private String userId;
	@Column	
    private String mobile;
	@Column
	private String secretquestion;
	@Column
    private String answer;	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
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
		return "Security1 [id=" + id + ", userId=" + userId + ", mobile=" + mobile + ", secretquestion="
				+ secretquestion + ", answer=" + answer + "]";
	}
	
	
	
	
}
