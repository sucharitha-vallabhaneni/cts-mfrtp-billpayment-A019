package com.bill.billpayment.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bill.billpayment.dao.Vendordao;
import com.bill.billpayment.domain.Security;
import com.bill.billpayment.domain.Vendor;
import com.bill.billpayment.domain.Vendorlogin;
@Service
@Component
public class VendorserviceImp implements Vendorservice
{
 @Autowired
 private Vendordao vendordao;
	@Override
	public int createVendor(Vendor vendor) {
		Vendor v=vendordao.findByUsername(vendor.getUsername());
		if(v==null)
		{
			Vendor v1=vendordao.save(vendor);
			if(v1!=null)
			{
				
			
			return 1;
			}
		}
		else
		{
			return 2;
		}
		return 0;
	}

	@Override
	public int login(Vendorlogin vendorlogin) {

		   Vendor v = vendordao.findByUsername(vendorlogin.getUsername());
		    if(v==null)
		    {
		    	return 0; // not registered
		    }else
		    {
		    	 if(v.getStatus().equals("deactive"))
		    	 {
		    		 return 1; // not yet activated
		    	 }
		    	 else {
		    	if(v.getPassword().equals(vendorlogin.getPassword()) && v.getStatus().equals("active"))
		    	{
		    		
		    		return 2 ; // login success;
		    	}
		    	else
		    	{
		    		return 3; //  invalid password
		    	}
		    	 }
		    }
		
		
		
	}

	

	@Override
	public Security getSecurity(String mobile) {
		 return vendordao.getSecurityCredentials(mobile); }
	 
	

	@Override
	public Security getSecuritypwd(String userId) {
		return vendordao.getSecuritypassword(userId);
	}

	@Override
	public boolean updatePassword(Vendor vendor) {
Vendor be1 = vendordao.save(vendor);
		
		if(be1!=null) {
			
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public Vendor getuserdata(String userId) {
		
		return vendordao.getVendor(userId);
	}

}
