package com.bill.billpayment.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bill.billpayment.dao.Customerdao;
import com.bill.billpayment.dao.Vendordao;
import com.bill.billpayment.domain.Customer;
import com.bill.billpayment.domain.Customerlogin;
import com.bill.billpayment.domain.Security;
import com.bill.billpayment.domain.Security1;
import com.bill.billpayment.domain.Vendor;

@Service
@Component
public class CustomerserviceImp implements Customerservice
{
	@Autowired
   private Customerdao customerdao;
   @Autowired
   private Vendordao vendordao;
	
	@Override
	public int createCustomer(Customer customer) 
	{
		Customer c= customerdao.findByUsername(customer.getUsername());
		if(c==null)
		{
			Customer c1=customerdao.save(customer);
			if(c1!=null)
			{
				return 1;
			}
			else
			{
				return 2;
			}
		}
				return 0;
	}
    @Override
	public boolean login(Customerlogin customerlogin) {

        Customer c = customerdao.findByUsername(customerlogin.getUsername());
        
        if(c!=null)
        {
        	return c.getPassword().equals(customerlogin.getPassword());
        }
	
	return false;
}

		
	@Override
	public Customer getCustomer(String username) {
		// TODO Auto-generated method stub
		return customerdao.findByUsername(username);
	}
	@Override
	public List<Vendor> getallvendors() 
	{
	
		
		return vendordao.findAll();
	}
	@Override
	public Security1 getSecurity1(String mobile) {
		 return customerdao.getSecurity1Credentials(mobile); }
	@Override
	public Security1 getSecurity1pwd(String userId) {
		return customerdao.getSecurity1password(userId);
	}
	@Override
	public boolean updatePassword(Customer customer) {
       Customer be1 = customerdao.save(customer);
		
		if(be1!=null) {
			
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public Customer getuserdata(String userId) {
		return customerdao.getCustomer(userId);
	}


}
