package com.bill.billpayment.bo;


import com.bill.billpayment.domain.Credit;


public interface Creditservice
{
	public boolean verify(Credit credit);
	public boolean status(String billnumber);
}
