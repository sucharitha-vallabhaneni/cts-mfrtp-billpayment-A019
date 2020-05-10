package com.bill.billpayment.controllers;

import javax.servlet.http.HttpSession; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



import com.bill.billpayment.domain.Help;

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
			
		session.setAttribute("vendor", vl.getUsername());
		
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
@GetMapping("/vendorregistration")
public String userSignUp(Model model)
{
Vendor vendor = new Vendor();
	model.addAttribute("venreg",vendor);
	return "vendorregistration";
}

@PostMapping( "/venregistration")
public String signup(@ModelAttribute("venreg") Vendor vendor,BindingResult result, Model model) {
	  vendor.setStatus("deactive");
	
	  if(result.hasErrors())
		{
			return "vendorregistration";
		}
		
		else 
		{
			Vendorlogin venlogin = new Vendorlogin();
			model.addAttribute("vendor",venlogin);
				
		int res = vs.createVendor(vendor);
		if(res==0)
		{
			model.addAttribute("message", vendor.getUsername().toUpperCase()+" You are already registered");
		
		
		}
		else if(res==1)
		{
			model.addAttribute("message", vendor.getUsername().toUpperCase()+"Congrats your registration is successfull");
		
		
		}
		else
		{
			model.addAttribute("message", "Some thing went wrong");
		
		}
		
		
		return "vendorlogin";
		}
	  
}
@GetMapping("/vendorupdate")
public String vendorupdatepage(Model model,HttpSession session)
{
	String vendorid =(String) session.getAttribute("vendor");
	
	
	
	Vendor vendor = vs.getVendor(vendorid);
	System.out.println(vendor);
	model.addAttribute("edit",vendor);
	return "edit";
}
@PostMapping("/update")
public String updateVendor(@ModelAttribute("edit") Vendor vendor,Model model)
{
 vs.saveOrUpdate(vendor);
 return "vendorportal";
}

@RequestMapping("/update/{username}")
public String edit(@PathVariable(name = "username") String username,Model model) {
   
    Vendor vendor = vs.getVendor(username);
   model.addAttribute("vendor", vendor);
     
    return "edit";
}
@GetMapping(value="/beforehelp1")
public String help(Model model)
{
	model.addAttribute("help",new Help());
	return "VenHelp";
}
@PostMapping(value="/afterhelp1")
public String help1(@ModelAttribute("help") Help h,BindingResult result,Model model) {
	if(result.hasErrors())
	{
		return "VenHelp";
	}
	else
	{
		int status=vs.help(h);
		if(status==1)
		{
			model.addAttribute("message","your issue is registered");
			return "VenHelp";
		}
		else
		{
			model.addAttribute("message","Something went wrong");
			return "failure";
		}
	}
}

}  

