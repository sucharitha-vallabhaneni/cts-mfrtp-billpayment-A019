package com.bill.billpayment.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bill.billpayment.dao.Customerdao;
<<<<<<< HEAD
import com.bill.billpayment.dao.HelpDao;
import com.bill.billpayment.dao.Vendordao;
import com.bill.billpayment.dao.feedbackdao;
import com.bill.billpayment.domain.Customer;
import com.bill.billpayment.domain.Customerlogin;
import com.bill.billpayment.domain.Feedbackquestions;
import com.bill.billpayment.domain.Help;
=======
import com.bill.billpayment.dao.Dthbilldao;
import com.bill.billpayment.dao.Vendordao;
import com.bill.billpayment.dao.ebilldao;
import com.bill.billpayment.domain.Customer;
import com.bill.billpayment.domain.Customerlogin;
import com.bill.billpayment.domain.Dth;
>>>>>>> 14dccf5f49eee87887066d9658d4dca137834b29
import com.bill.billpayment.domain.Vendor;
import com.bill.billpayment.domain.electricity;

@Service
@Component
public class CustomerserviceImp implements Customerservice
{
	@Autowired
   private Customerdao customerdao;
	@Autowired
	private Vendordao vendordao;
<<<<<<< HEAD
	@Autowired 
	private feedbackdao fdao;
	@Autowired 
	private HelpDao hdao;
	
=======
@Autowired
private ebilldao edao;
@Autowired
private Dthbilldao ddao;
>>>>>>> 14dccf5f49eee87887066d9658d4dca137834b29
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
<<<<<<< HEAD
	public int CreateFeedback(Feedbackquestions fq) {
		Feedbackquestions f=fdao.findByusername(fq.getUsername());
		if(f==null) {
		Feedbackquestions f1=fdao.save(fq);
		if(f1!=null) {
			return 1;
		}else {
			return 2;
		}
		
	}
		return 0;
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
=======
	public List<electricity> geElectricities() {
		
		return edao.findAll();
	}
	@Override
	public List<Dth> getDth() {
		
		return ddao.findAll();
>>>>>>> 14dccf5f49eee87887066d9658d4dca137834b29
	}

}
