package com.bill.billpayment.domain;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import javax.validation.constraints.NotEmpty;

@Entity
@Table(name ="electric_bills")
public class electricity 
{
	@Id
	@SequenceGenerator(name = "ebill",initialValue = 5010,allocationSize = 1,sequenceName = "EBILL_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="ebill")
	private int id;

	@Column(unique = true)
	   @NotEmpty(message = "bill number should not  be empty")
	private String billnumber;

	  


	

@Column
@NotEmpty(message = "service number should not  be empty")
private String servicenumber;

@Column
private String amount;
/*@Column
private Date billpaydate;*/


@Column
private String state;
@Column
private String board;

@ManyToOne
private Customer customer;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
public String getBillnumber() {
	return billnumber;
}

public void setBillnumber(String billnumber) {
	this.billnumber = billnumber;
}


public String getServicenumber() {
	return servicenumber;
}

public void setServicenumber(String servicenumber) {
	this.servicenumber = servicenumber;
}

public String getAmount() {
	return amount;
}

public void setAmount(String amount) {
	this.amount = amount;
}

/*public Date getBillpaydate() {
	return billpaydate;
}

public void setBillpaydate(String billpaydate) 
{
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	Date dt = null;
	try
	{
		dt = dateFormat.parse(billpaydate);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	this.billpaydate = dt;
}*/


public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getBoard() {
	return board;
}

public void setBoard(String board) {
	this.board = board;
}

public Customer getCustomeruname() {
	return customer;
}
public void setCustomeruname(Customer customeruname) {
	this.customer = customeruname;
}

@Override
public String toString() {
	return "electricity [id=" + id + ", billnumber=" + billnumber + ", servicenumber=" + servicenumber + ", amount="
			+ amount + ", state=" + state + ", board=" + board + ", customer=" + customer + "]";
}




}
