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
import org.springframework.web.bind.annotation.RequestParam;

import com.bill.billpayment.bo.Adminservice;
import com.bill.billpayment.domain.Aminlogin;
import com.bill.billpayment.domain.Dth;
import com.bill.billpayment.domain.Vendor;
import com.bill.billpayment.domain.electricity;

@Controller
public class AdminController 
{
@Autowired
private Adminservice as;
@GetMapping("/admin")
public String login(Model model)
{
	Aminlogin al=new Aminlogin();
	model.addAttribute("admin",al);
	return "adminlogin";
}
@PostMapping("/adminlogin")
public String loginverify(@Valid @ModelAttribute("admin") Aminlogin al,BindingResult result,Model model,HttpSession session)
{
if(result.hasErrors())	
{
	return "adminlogin";
}
else
{
	boolean status=as.login(al);
	if(status)
	{
		session.setAttribute("adminusername", al.getUsername());
		
		return "adminportal";
	}
	else
	{
	model.addAttribute("message", "Invalid UserName or Password");
		return "adminlogin";
	}


}}
@GetMapping("/vendors")
public String showvendors(HttpSession session,Model model)
{
	List<Vendor> vendorlist=as.getallvendors();
	model.addAttribute("userList",vendorlist);
	return "vendorlist";
}
@GetMapping("activate")
public String activate(@RequestParam("id")String username) {
	boolean b1=as.activate(username);
	if(b1)
	{
		return "vasuccess";
	}
	return "failure";
}
@GetMapping("deactivate")
public String deactivate(@RequestParam("id") String username)
{
	boolean b1=as.deactivate(username);
	if(b1)
	{
		return "vdeac";
	}
	return "failure";
}
@GetMapping("/transaction")
public String generatereport(Model model){
	
	List<electricity> list=as.getelectricbills();
	List<electricity> l1=new ArrayList<electricity>();
	
	for(electricity b:list)
	{
		if(b.getTransactionstatus().equalsIgnoreCase("success"))
		{
	          l1.add(b);
	    }
						
	}
	
	
	model.addAttribute("list",l1);
	
	return "GenerateReport";
}
@GetMapping("/fail")
public String generatefailreport(Model model){
	List<electricity> list=as.getelectricbills();
	List<electricity> l2=new ArrayList<electricity>();
	for(electricity b:list)
	{
		
		if(b.getTransactionstatus().equalsIgnoreCase("failure"))
		{
			l2.add(b);
		}
				
	}
	model.addAttribute("flist",l2);
	return "GenerateFailureReport";
}
@GetMapping("/transaction1")
public String generatereport1(Model model){
	
	List<Dth> list=as.getdthbills();
	List<Dth> l1=new ArrayList<Dth>();
	
	for(Dth b:list)
	{
		if(b.getTransactionstatus().equalsIgnoreCase("success"))
		{
	          l1.add(b);
	    }
						
	}
	
	
	model.addAttribute("list",l1);
	
	return "GenerateReport";
}
@GetMapping("/fail1")
public String generatefailreport1(Model model){
	List<Dth> list=as.getdthbills();
	List<Dth> l2=new ArrayList<Dth>();
	for(Dth b:list)
	{
		
		if(b.getTransactionstatus().equalsIgnoreCase("failure"))
		{
			l2.add(b);
		}
				
	}
	model.addAttribute("flist",l2);
	return "GenerateFailureReport";
}


@GetMapping("/back")
public String returntohome(Model model)
{
	return "adminportal";
}

@GetMapping("/adminlogout")
public String logout(HttpSession session) {
	
	session.invalidate();
	return "home";
}
}
