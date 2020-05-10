package com.bill.billpayment.bo;

import java.util.List;

import com.bill.billpayment.domain.Customer;
import com.bill.billpayment.domain.Customerlogin;
<<<<<<< HEAD
import com.bill.billpayment.domain.Feedbackquestions;
import com.bill.billpayment.domain.Help;
=======
import com.bill.billpayment.domain.Dth;
>>>>>>> 14dccf5f49eee87887066d9658d4dca137834b29
import com.bill.billpayment.domain.Vendor;
import com.bill.billpayment.domain.electricity;

public interface Customerservice 
{

	public int createCustomer(Customer customer);
	public boolean login(Customerlogin customerlogin) ;
	
		public Customer getCustomer(String username);
		public List<Vendor> getallvendors();
<<<<<<< HEAD
		int CreateFeedback(Feedbackquestions fq);
		int help(Help h);
	
=======
		public List<electricity> geElectricities();
		public List<Dth> getDth();
>>>>>>> 14dccf5f49eee87887066d9658d4dca137834b29
}
