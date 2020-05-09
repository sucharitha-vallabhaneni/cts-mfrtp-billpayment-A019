package com.bill.billpayment.bo;


import com.bill.billpayment.domain.Security;
import com.bill.billpayment.domain.Vendor;
import com.bill.billpayment.domain.Vendorlogin;

public interface Vendorservice 
{
	public int createVendor(Vendor vendor);
	public int login(Vendorlogin vendorlogin);
		
		 public Security getSecurity(String mobile);
		  public Security getSecuritypwd(String userId); 
		  public boolean updatePassword(Vendor vendor);
		  public Vendor getuserdata(String userId);
}
