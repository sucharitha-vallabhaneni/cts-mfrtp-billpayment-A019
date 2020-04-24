package com.bill.billpayment.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bill.billpayment.bo.AdminServices;
import com.bill.billpayment.domain.Admin;
import com.bill.billpayment.domain.AdminLogin;
import com.bill.billpayment.domain.Vendor;
@Controller
public class AdminController {
 
	@Autowired
	private AdminServices adminservice;
	
	@GetMapping(value="/admin")
	public String adminLogin(Model model)
	{
	  Admin admin = new Admin();
	  model.addAttribute("admin", admin);
	  return "admin";
	}
	@PostMapping(value="/adminreg")
	public String adminreg(@ModelAttribute("admin") Admin adminreg,Model model) {
		int res=adminservice.createAdmin(adminreg);	
		if(res==1) {
			model.addAttribute("message","Your  are already registered.");
			return "admin";
		}else if(res==2) {
			model.addAttribute("message","Your details are submitted successfully.");
			return "admin";
		}else {
			model.addAttribute("message","Oops...Something went wrong.");
			return "admin";
		}
		
	}
	@GetMapping(value="/adminlogin")
	public String adminlogin(Model model) {
		model.addAttribute("adminlogin", new AdminLogin());
		return "adminlogin";
	}
	
	@PostMapping(value="/loginverify")
	public String loginverify(@ModelAttribute("adminlogin") AdminLogin adminlogin,Model model,HttpSession session) {
		boolean b1=adminservice.loginVerification(adminlogin);
		if(b1){
			session.setAttribute("name", adminlogin.getUserid());
			return "adminportal";
		}
		model.addAttribute("message", "Invalid UserId or Password");
		return "home";
	}
	@GetMapping("/vendors")
	 public String getVendors(Model model,HttpSession session)
	 {
		
		List<Vendor> cList =adminservice.vendorList();
		 
		 model.addAttribute("coursesList",cList);
		 return "adminhome";
	 }

	@GetMapping("/adminLogout")
	public String adminLogOut(HttpSession session)
	{
		session.invalidate();
		
		return "redirect:/";
	}

	
   }
