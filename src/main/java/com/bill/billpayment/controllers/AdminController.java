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

import com.bill.billpayment.domain.Adminlogin;
import com.bill.billpayment.domain.Vendor;
@Controller
@RequestMapping( "/")

public class AdminController {
 
	@Autowired
	private AdminServices adminservice;
	
		
	@GetMapping(value="/admin")
	public String adminlogin(Model model) {
		model.addAttribute("admin", new Adminlogin());
		return "adminlogin";
	}
	
	@PostMapping(value="/adminlogin")
	public String loginverify(@ModelAttribute("admin") Adminlogin adminlogin,Model model,HttpSession session) {
		boolean b1=adminservice.loginVerification(adminlogin);
		if(b1){
			session.setAttribute("name", adminlogin.getUsername());
			return "adminportal";
		}
		model.addAttribute("message", "Invalid UserId or Password");
		return "home";
	}
	@GetMapping("/vendors")
	 public String getVendors(Model model,HttpSession session)
	 {
		
		List<Vendor> vList =adminservice.vendorList();
		 
		 model.addAttribute("coursesList",vList);
		 return "adminportal";
	 }

	@GetMapping("/adminLogout")
	public String adminLogOut(HttpSession session)
	{
		session.invalidate();
		
		return "redirect:/";
	}

	
   }
