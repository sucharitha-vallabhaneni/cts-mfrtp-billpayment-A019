package com.bill.billpayment.domain;

import java.sql.Time;

import java.text.SimpleDateFormat;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="reminders")
public class Reminders 
{
	
		@Id
		@SequenceGenerator(name = "remSequence",initialValue =201,allocationSize = 1,sequenceName = "REM_SEQ")
		@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="remSequence")
		private int id;

	@Column
	private String billtype;
	@Temporal(TemporalType.DATE)
	private Date date;
	@Column
	private Time time;
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
	public void setDate(String date) 
	{
		SimpleDateFormat dateformatt = new SimpleDateFormat("yyyy-MM-dd");
		try {
		this.date = dateformatt.parse(date);
		}catch (Exception e) {

	e.printStackTrace();
		}
		
	}
	public Time getTime() 
	{
		return time;
	}
	public void setTime(Time time) 
	{
		this.time=time;
	}
	@Override
	public String toString() {
		return "Reminders [id=" + id + ", billtype=" + billtype + ", date=" + date + ", time=" + time + "]";
	}
	
	
	}
	

