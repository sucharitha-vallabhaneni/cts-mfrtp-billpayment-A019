package com.bill.billpayment.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bill.billpayment.domain.Vendor;
import com.bill.billpayment.bo.Vendorservice;

import com.bill.billpayment.domain.Vendorlogin;

@Controller
@RequestMapping("/")
public class VendorController 
{
@Autowired
private Vendorservice vs;

@GetMapping("/vendor")
public String Vendor(Model model)
{
	Vendorlogin vl=new Vendorlogin();
	model.addAttribute("vendor",vl);
	return "vendorlogin";
}
@PostMapping(value = "/venlogin")
public String vendorlogin(@ModelAttribute("vendor") Vendorlogin vl,BindingResult result, Model model,HttpSession session)
		{
	if(result.hasErrors())
	{
		return "vendorlogin";
	}
	else {
	int res=vs.login(vl);

	if(res==0)
	{
		model.addAttribute("message", "You are not registered");
		model.addAttribute("vendor",vl);
		
		return "user";
	}
	else if(res==1) 
	{
		model.addAttribute("message", "Not yet activated");
model.addAttribute("vendor",vl);
		
		return "vendorlogin";
		
		
	}
	else if(res==2) 
	{
				return "vendorportal";
		
		
	}
	else
	{
model.addAttribute("vendor", vl);
model.addAttribute("message", "Invalid Password");	
		return "vendorlogin";
	
	}
}
		}
@GetMapping("/vendorregister")
public String userSignUp(Model model)
{
Vendor vendor = new Vendor();
	model.addAttribute("venreg",vendor);
	return "vendorregistration";
}

@PostMapping(value = "/venregistration")
public String signup(@ModelAttribute("venreg") Vendor vendor,BindingResult result, Model model) {
	  vendor.setStatus("deactive");
	
	System.out.println(vendor);
	int res =vs.createVendor(vendor);
	if(res==1)
	{
		model.addAttribute("message", vendor.getUsername()+"\t Your Account is created Successfully");
		
		return "vendorlogin";
	}else if(res==2)
	{
		model.addAttribute("message",vendor.getUsername()+"\t Your Account is already existed");
		return "vendorlogin";	
	}else
	{
		model.addAttribute("message", vendor.getUsername()+"\t There is some problem please contact");
		return "vendorregistration";
	}
	
}
}
