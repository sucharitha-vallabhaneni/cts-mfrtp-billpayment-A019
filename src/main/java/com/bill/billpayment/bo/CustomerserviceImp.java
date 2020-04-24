package com.bill.billpayment.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bill.billpayment.dao.Customerdao;
import com.bill.billpayment.domain.Customer;
import com.bill.billpayment.domain.Customerlogin;

@Service
@Component
public class CustomerserviceImp implements Customerservice
{
	@Autowired
   private Customerdao customerdao;
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
		return null;
	}

}
