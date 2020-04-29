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

@Entity
@Table(name="reminders")
public class Reminders 
{
	@Id
	@SequenceGenerator(name = "",initialValue = 201,allocationSize = 1,sequenceName = "MESSAGE_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="messageSeq")
	private int id;
	@Column
	private String billtype;
	@Column
	private Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBilltype() {
		return billtype;
	}
	public void setBilltype(String billtype) {
		this.billtype = billtype;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(String date) {
		SimpleDateFormat dateformatt = new SimpleDateFormat("yyyy-MM-dd");
		try {
		this.date = dateformatt.parse(date);
		}catch (Exception e) {

	e.printStackTrace();
		}
	}
	}
	

