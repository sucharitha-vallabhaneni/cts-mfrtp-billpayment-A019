package com.bill.billpayment.bo;


import com.bill.billpayment.domain.Dthcredit;

public interface Dthcreditservice {
	public boolean verify(Dthcredit credit);
	public boolean dthstatus(String servicenumber);

}
