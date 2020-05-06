package com.bill.billpayment.domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "credit_details")
public class Credit 
{
	@Id
	@Column
private String cardnumber;
	@Column
	private  String name;
	@Column
	private String expdate;
	
	@Column
	private String cvv;
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	public  String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExpdate() {
		return expdate;
	}
	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	@Override
	public String toString() {
		return "Credit [cardnumber=" + cardnumber + ", name=" + name + ", expdate=" + expdate + ", cvv=" + cvv + "]";
	}
	
}
