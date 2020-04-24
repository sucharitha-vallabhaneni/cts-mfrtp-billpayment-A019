package com.bill.billpayment.bo;


import com.bill.billpayment.domain.Vendor;
import com.bill.billpayment.domain.Vendorlogin;

public interface Vendorservice 
{
	public int createVendor(Vendor vendor);
	public int login(Vendorlogin vendorlogin);
		public Vendor getVendor(String username);
}
