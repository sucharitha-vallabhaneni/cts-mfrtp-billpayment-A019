package com.bill.billpayment.bo;


import com.bill.billpayment.domain.Gpay;

public interface Gpayservice 
{
	public boolean verify(Gpay gpay);
	public boolean status(String billnumber);
	public boolean dstatus(String billnumber);
}
