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
import org.springframework.web.bind.annotation.RequestParam;
import com.bill.billpayment.domain.Customerlogin;
import com.bill.billpayment.domain.Security;
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
@GetMapping("/vendorregistration")
public String userSignUp(Model model,Model secmodel)
{
Vendor vendor = new Vendor();
	model.addAttribute("venreg",vendor);
	Security secure = new Security();
	 secmodel.addAttribute("securityque", secure);
	return "vendorregistration";
}

@PostMapping( "/venregistration")
public String signup(@ModelAttribute("venreg") Vendor vendor,@ModelAttribute("securityque") Security sec,BindingResult result, Model model) {
	  vendor.setStatus("deactive");
	
	  if(result.hasErrors())
		{
			return "vendorregistration";
		}
		
		else 
		{
			Vendorlogin venlogin = new Vendorlogin();
			model.addAttribute("vendor",venlogin);
			sec.setUserId(vendor.getUsername());
			vendor.setSecurity(sec);
			System.out.println(vendor);			
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
@GetMapping(value="/forgotuserId")
public String forgetId(Model model) {
 return "ForgotUserId"; }

 @PostMapping("/getUserId") 
 public String getUserid(@RequestParam("mobile") String contactNumber,@RequestParam("secretquestion") String question,@RequestParam("answer") String answer,Model model) {
 
 System.out.println(question +" "+answer); 
 Security sc =vs.getSecurity(contactNumber);
 System.out.println(sc); 
 if(sc==null)
{
	  model.addAttribute("message","Your contact number is not registered with us ");
	  return "ForgotUserId";
 }
 
 if(question.equals(sc.getSecretquestion()) && answer.equals(sc.getAnswer()))
 {

	  model.addAttribute("message", "Your User Id is :<b>"+sc.getUserId());
	  return "ForgotUserId"; 
	  } 
 else
 {
	  model.addAttribute("message","Invalid secret question credentials ");
	  return "ForgotUserId";

}
 } 
@GetMapping(value="/forgotpassword")
public String forgetPwd(Model model) {
 return "ForgotPassword";
 }
 
 @PostMapping(value="/getpwd")
 public String getPassword(@RequestParam("username") String userid,@RequestParam("secretquestion") String que,@RequestParam("answer") String ans, Model model,HttpSession session) { 
	  Security sc =vs.getSecuritypwd(userid); 
	  System.out.println(sc); 
	  if(sc==null)
		 {
			 model.addAttribute("message", "Your UserId is not not registered with us ");
			 return "ForgotPassword";
		 }
		 
		if(que.equals(sc.getSecretquestion()) && ans.equals(sc.getAnswer()))
		 {
			// model.addAttribute("message", "Your password is :<b>"+sc.getPassword());
			
			model.addAttribute("userid", sc.getUserId());
			 
			 return "ResetPassword";	 
		 }
		 else
		 {
			 model.addAttribute("message", "Invalid secret question credentials ");
			 return "ForgotPassword";
			
		 }

 }
 
 @PostMapping("/resetpwd")
 public String resetPassword(@RequestParam("password")String pwd,@RequestParam("confirmationpassword")String cpwd,Model model,HttpSession session, @RequestParam("username") String username)
 {
 
//String userid = (String)session.getAttribute("username");
 

 if(pwd.equals(cpwd)) { 
	 Vendor be =vs.getuserdata(username); 
	  be.setPassword(pwd);
	  be.setConfirmationpassword(cpwd);
	
 
 boolean status = vs.updatePassword(be);
 if(status == true) {
 
model.addAttribute("message", "reset password Sucessfully");
return"ResetPassword"; 
}
 else
 {
	 model.addAttribute("message", "not reset"); 
     return "ResetPassword"; 
 	}

}
 else
 {
	  model.addAttribute("message","new password and conformation are not same"); 
	  return "ResetPassword";
	  }
 }

}
