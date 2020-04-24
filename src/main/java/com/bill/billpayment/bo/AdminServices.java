package com.bill.billpayment.bo;

import java.util.List;

import com.bill.billpayment.domain.Admin;
import com.bill.billpayment.domain.AdminLogin;
import com.bill.billpayment.domain.Vendor;

public interface AdminServices {
 

	public int createAdmin(Admin admin );
	public boolean loginVerification(AdminLogin adminlogin );
	public List<Vendor>  vendorList();
}
