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
	@SequenceGenerator(name = "helpSequence",initialValue = 4010,allocationSize = 1,sequenceName = "HELP_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="helpSequence")
	   private int serialno;
	
	@Column
	private String userId;
	   @Column
	   private String issue;
	   @Column 
	   private String description;
	   @Column
	   private String status="not resolved";
	   public int getSerialno() {
			return serialno;
		}
		public void setSerialno(int serialno) {
			this.serialno = serialno;
		}
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
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
		return "Help [serialno=" + serialno + ", userId=" + userId + ", issue=" + issue + ", description=" + description
				+ ", status=" + status + "]";
	}
	

}
