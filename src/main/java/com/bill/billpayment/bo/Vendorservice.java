package com.bill.billpayment.bo;


import com.bill.billpayment.domain.Help;
import com.bill.billpayment.domain.Vendor; 
import com.bill.billpayment.domain.Vendorlogin;

import java.util.List;

import org.springframework.data.repository.CrudRepository;




public interface Vendorservice 
{
	public int createVendor(Vendor vendor);
	public int login(Vendorlogin vendorlogin);
	public List<Vendor> getallvendors();
		public Vendor getVendor(String username);
		public int updatevendor(Vendor vendor);
		public void saveOrUpdate(Vendor vendor);
		int help(Help h);
}
