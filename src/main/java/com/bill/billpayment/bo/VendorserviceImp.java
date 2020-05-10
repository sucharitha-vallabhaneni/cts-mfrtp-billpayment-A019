package com.bill.billpayment.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bill.billpayment.dao.HelpDao;
import com.bill.billpayment.dao.Vendordao;
import com.bill.billpayment.domain.Help;
import com.bill.billpayment.domain.Vendor;
import com.bill.billpayment.domain.Vendorlogin;
@Service
@Component
public class VendorserviceImp implements Vendorservice
{
 @Autowired
 private Vendordao vendordao;
 @Autowired
 private HelpDao hdao;
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
	public Vendor getVendor(String username) {
		
		return vendordao.findByUsername(username);
		
	}

	
	@Override
	public void saveOrUpdate(Vendor vendor) {
		// TODO Auto-generated method stub
		
		vendordao.save(vendor);

	
		
	}

	@Override
	public int updatevendor(Vendor vendor) {
		// TODO Auto-generated method stub
	
		return 0;
		
	}

	@Override
	public List<Vendor> getallvendors() {
		// TODO Auto-generated method stub
		return vendordao.findAll();
	}

	@Override
	public int help(Help h) {
		Help h1=hdao.save(h);
		if(h1!=null) {
		return 1;
		}
		else
		{
			return 2;
			
		}
	}	

}
