package com.bill.billpayment.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="help")

public class Help {
	@Id
	@SequenceGenerator(name = "vendorseq",initialValue = 4010,allocationSize = 1,sequenceName = "HEL_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="helpseq")
	   
	   private int userId;
	   @Column
	   private String issue;
	   @Column 
	   private String description;
	   @Column
	   private String status="new";
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Help [userId=" + userId + ", issue=" + issue + ", description=" + description + ", status=" + status + "]";
	}
	   

}
