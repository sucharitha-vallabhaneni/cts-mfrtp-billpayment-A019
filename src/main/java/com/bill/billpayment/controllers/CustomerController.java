package com.bill.billpayment.controllers;

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

import com.bill.billpayment.domain.Customerlogin;

@Controller
@RequestMapping( "/")
public class CustomerController {
	@Autowired
	private Customerservice cs;
    	@GetMapping("/customer")
	public String Customer(Model model)
	{
		Customerlogin cl=new Customerlogin();
		model.addAttribute("customer",cl);
		return "customerlogin";
	}
	
	@PostMapping(value="/cuslogin")
	public String studentLogin(@ModelAttribute("customer") Customerlogin custlogin,BindingResult result, Model model,HttpSession session)
	{
		if(result.hasErrors())
		{
			return "customerlogin";
		}
		else {
		boolean status=cs.login(custlogin);
		if(status)
		{
			session.setAttribute("custusername",custlogin.getUsername());
			return "customerportal";
		}
		else
		{
			model.addAttribute("message","Invalid Username OR password");
			return "customerlogin";
		}
		
		}
	}
	
	
	@GetMapping("/register")
	public String customerRegisterForm(Model model)
	{
		Customer customer=new com.bill.billpayment.domain.Customer();
		model.addAttribute("cusreg", customer);
		
		return "customerregistration";
	}

	
	@PostMapping(value = "/cusregistration")
	public String registercustomer(@Valid @ModelAttribute("cusreg") Customer customer,BindingResult result,Model model)
	{
		if(result.hasErrors())
		{
			return "customerregistration";
		}
		
		else 
		{
			Customerlogin cuslogin = new Customerlogin();
			model.addAttribute("cusreg",cuslogin);
				
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
}