package com.bill.billpayment.bo;


import java.util.List;

import com.bill.billpayment.domain.Dth;
import com.bill.billpayment.domain.Security;
import com.bill.billpayment.domain.Vendor;
import com.bill.billpayment.domain.Help;

import com.bill.billpayment.domain.Vendor; 
import com.bill.billpayment.domain.Vendorlogin;
import com.bill.billpayment.domain.electricity;

import java.util.List;




public interface Vendorservice 
{
	public int createVendor(Vendor vendor);
	public int login(Vendorlogin vendorlogin);
		
		 public Security getSecurity(String mobile);
		  public Security getSecuritypwd(String userId); 
		  public boolean updatePassword(Vendor vendor);
		  public Vendor getuserdata(String userId);
		  public List<electricity> getelectricbills();
		  public List<Dth> getdthbills();

	public List<Vendor> getallvendors();
		public Vendor getVendor(String username);
		public int updatevendor(Vendor vendor);
		public void saveOrUpdate(Vendor vendor);
		int help(Help h);
}
