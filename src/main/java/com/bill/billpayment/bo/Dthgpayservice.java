package com.bill.billpayment.bo;

import com.bill.billpayment.domain.Dthgpay;


public interface Dthgpayservice {
	public boolean verify(Dthgpay gpay);
	public boolean dstatus(String billnumber);
}
