package com.bill.billpayment.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.swing.text.DateFormatter;
import javax.validation.Valid;

import org.hibernate.validator.constraints.br.TituloEleitoral;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name ="records_bills")
public class Recordbills 
{
	//record of bills
	@Id
	@SequenceGenerator(name = "billSequence",initialValue = 101,allocationSize = 1,sequenceName = "BILL_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="billSequence")
	private int idr;

	

	  

@Column
private String billname;

@Column
private String billnumber;

@Temporal(TemporalType.DATE)
private Date billpaiddate;
@Column
private String billamount;
@ManyToOne
private Customer customer;
public String getBillname() {
	return billname;
}
public void setBillname(String billname) {
	this.billname = billname;
}
public String getBillnumber() {
	return billnumber;
}
public void setBillnumber(String billnumber) {
	this.billnumber = billnumber;
}
public Date getBillpaiddate() {
	return billpaiddate;
}
public void setBillpaiddate(String billpaiddate) {
	SimpleDateFormat dateformatt = new SimpleDateFormat("yyyy-MM-dd");
	try {
	this.billpaiddate = dateformatt.parse(billpaiddate);
	}catch (Exception e) {

e.printStackTrace();
	}
}
public String getBillamount() {
	return billamount;
}
public void setBillamount(String billamount) {
	this.billamount = billamount;
}
public Customer getCustomeruname() {
	return customer;
}
public void setCustomeruname(Customer customeruname) {
	this.customer = customeruname;
}
@Override
public String toString() {
	return "Recordbills [billname=" + billname + ", billnumber=" + billnumber + ", billpaiddate="
			+ billpaiddate + ", billamount=" + billamount + ", customeruname=" + customer + "]";
}

}
