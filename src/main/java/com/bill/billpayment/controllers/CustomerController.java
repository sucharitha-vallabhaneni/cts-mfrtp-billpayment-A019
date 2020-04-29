package com.bill.billpayment.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bill.billpayment.domain.Customer;
import com.bill.billpayment.bo.Customerservice;
import com.bill.billpayment.bo.Recordbillsservice;
import com.bill.billpayment.domain.Customerlogin;
import com.bill.billpayment.domain.Recordbills;
import com.bill.billpayment.domain.Reminders;
import com.bill.billpayment.domain.Vendor;

@Controller

public class CustomerController {
	@Autowired
	private Customerservice cs;
@Autowired
private Recordbillsservice rbs;
//displaying customer login page
    	@GetMapping("/customer")
	public String Customer(Model model)
	{
		Customerlogin cl=new Customerlogin();
		model.addAttribute("customer",cl);
		return "customerlogin";
	}
	//verifying customer login
	@PostMapping("/cuslogin")
	public String studentLogin(@ModelAttribute("customer") Customerlogin cl,BindingResult result, Model model,HttpSession session)
	{
		if(result.hasErrors())
		{
			return "customerlogin";
		}
		else {
		boolean status=cs.login(cl);
		if(status)
		{
			session.setAttribute("custusername",cl.getUsername());
			return "customerportal";
		}
		else
		{
			model.addAttribute("message","Invalid Username OR password");
			return "customerlogin";
		}
		
		}
	}
	
	//displaying customer registration page
	
	@GetMapping("/customerregister")
	public String customerRegisterForm(Model model)
	{
		Customer customer=new Customer();
		model.addAttribute("cusreg", customer);
		
		return "customerregistration";
	}

	//registering customer details
	@PostMapping("/cusregistration")
	public String registercustomer(@Valid @ModelAttribute("cusreg") Customer customer,BindingResult result,Model model)
	{
		if(result.hasErrors())
		{
			return "customerregistration";
		}
		
		else 
		{
			Customerlogin cuslogin = new Customerlogin();
			model.addAttribute("customer",cuslogin);
				
		int res = cs.createCustomer(customer);
		if(res==0)
		{
			model.addAttribute("message", customer.getFirstname().concat(customer.getLastname()).toUpperCase()+" You are already registered");
		
		
		}
		else if(res==1)
		{
			model.addAttribute("message", customer.getFirstname().concat(customer.getLastname()).toUpperCase()+"Congrats your registration is successfull");
		
		
		}
		else
		{
			model.addAttribute("message", "Some thing went wrong");
		
		}
		
		
		return "customerlogin";
		}
}
	//displaying list of activated vendors
	@GetMapping("cusvendors")
	public String displayvendors(HttpSession session,Model model)
	{
		List<Vendor> vendorlist=cs.getallvendors();
		
		List<Vendor> vendorlist1=new ArrayList();
		for(Vendor v:vendorlist) {
			if(v.getStatus().equalsIgnoreCase("active"))
			{
				vendorlist1.add(v);
			}
		}
		if(vendorlist1.isEmpty()) {
			model.addAttribute("ifempty", "Accepted list is empty");
		}
		model.addAttribute("usersList",vendorlist1);
		return "cusvendorlist";
	}
	
	//moving back to customer portal
	@GetMapping("backtohome")
	public String backtoportal(Model model)
	{
		return "customerportal";
	}
	
	//for  displaying record bills page
	@GetMapping("recordbill")
	public String recordbillspage(Model model)
	{
		Recordbills rb=new Recordbills();
		model.addAttribute("recbills",rb);
		return "Recordbillscus";
	}
	//for recording bills
	@PostMapping("savebills")
	public String savebills(@Valid @ModelAttribute("recbills") Recordbills rb,BindingResult result,Model model,HttpSession session)
	{
		if(result.hasErrors())
		{
			return "Recordbillscus";
		}
		
		else 
		{
			
			String custusername=(String) session.getAttribute("custusername");
			Customer c = cs.getCustomer(custusername);
			System.out.println(c);
			rb.setCustomeruname(c);

					int res = rbs.savebills(rb);
		
		 if(res==1)
		{
			model.addAttribute("success", "Congrats your bill has been recorded  successfully");
		      
		
		}
		
		
		 model.addAttribute("message", "Congrats your bill has been recorded  successfully");
		return "customerportal";
		}
}
	//for redirecting to set reminders page
	@GetMapping("reminder")
	public String reminderpage(Model model)
	{
		Reminders rem=new Reminders();
		model.addAttribute("reminder",rem);
		return "setreminder";
	}
	
}