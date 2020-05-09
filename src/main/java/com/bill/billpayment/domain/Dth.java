package com.bill.billpayment.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

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
@Table(name ="dth_bills")
public class Dth 
{
	@Id
	@SequenceGenerator(name = "dthbill",initialValue = 8010,allocationSize = 1,sequenceName = "DTHBILL_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="dthbill")
	private int id;
	@Column
	@NotEmpty(message = "service number should not  be empty")
	private String servicenumber;
  @Column
  @NotEmpty(message = "mobile number should not  be empty")
  private String rmn;
	
@Column
private String dthname;
	
	@Column
	
	private String amount;
	@Column
	private Date billpaydate;
	@ManyToOne
	private Customer customer;

	@Column
	private String transactionstatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getServicenumber() {
		return servicenumber;
	}

	public void setServicenumber(String servicenumber) {
		this.servicenumber = servicenumber;
	}
	public String getRmn() {
		return rmn;
	}

	public void setRmn(String rmn) {
		this.rmn = rmn;
	}
	public String getDthname() {
		return dthname;
	}

	public void setDthname(String dthname) {
		this.dthname = dthname;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getBillpaydate() {
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
	}

	public Customer getCustomeruname() {
		return customer;
	}
	public void setCustomeruname(Customer customeruname) {
		this.customer = customeruname;
	}

	public String getTransactionstatus() {
		return transactionstatus;
	}

	public void setTransactionstatus(String transactionstatus) {
		this.transactionstatus = transactionstatus;
	}

	@Override
	public String toString() {
		return "Dth [id=" + id + ", servicenumber=" + servicenumber + ", rmn=" + rmn + ", dthname=" + dthname
				+ ", amount=" + amount + ", billpaydate=" + billpaydate + ", customer=" + customer
				+ ", transactionstatus=" + transactionstatus + "]";
	}

	

	
}
