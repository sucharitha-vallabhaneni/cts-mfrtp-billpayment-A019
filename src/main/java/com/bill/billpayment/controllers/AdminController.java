package com.bill.billpayment.controllers;

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
import com.bill.billpayment.domain.Vendor;

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
@GetMapping("/back")
public String returntohome(Model model)
{
	return "adminportal";
}
}
