package com.bill.billpayment.controllers;

import java.util.ArrayList;
import java.util.List;
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
import org.springframework.web.bind.annotation.RequestParam;
import com.bill.billpayment.domain.Dth;
import com.bill.billpayment.domain.Security;
import com.bill.billpayment.domain.Vendor;



import com.bill.billpayment.domain.Help;

import com.bill.billpayment.bo.HelpService;
import com.bill.billpayment.bo.Vendorservice;
import com.bill.billpayment.domain.Vendorlogin;
import com.bill.billpayment.domain.electricity;

@Controller
@RequestMapping("/")
public class VendorController 
{
@Autowired
private Vendorservice vs;
@Autowired
private HelpService hs;
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

@GetMapping("/transactionE")
public String generatereport(Model model){
	
	List<electricity> list=vs.getelectricbills();
	List<electricity> l1=new ArrayList<electricity>();
	
	for(electricity b:list)
	{
		if(b.getTransactionstatus().equalsIgnoreCase("success"))
		{
	          l1.add(b);
	    }
						
	}
	
	
	model.addAttribute("list",l1);
	
	return "GenerateVendorReport";
}
@GetMapping("/failE")
public String generatefailreport(Model model){
	List<electricity> list=vs.getelectricbills();
	List<electricity> l2=new ArrayList<electricity>();
	for(electricity b:list)
	{
		
		if(b.getTransactionstatus().equalsIgnoreCase("failure"))
		{
			l2.add(b);
		}
				
	}
	model.addAttribute("flist",l2);
	return "GenerateVFailure";
}
@GetMapping("/transactionD")
public String generatereport1(Model model){
	
	List<Dth> list=vs.getdthbills();
	List<Dth> l1=new ArrayList<Dth>();
	
	for(Dth b:list)
	{
		if(b.getTransactionstatus().equalsIgnoreCase("success"))
		{
	          l1.add(b);
	    }
						
	}
	
	
	model.addAttribute("list",l1);
	
	return "GenerateVendorReport";
}
@GetMapping("/failD")
public String generatefailreport1(Model model){
	List<Dth> list=vs.getdthbills();
	List<Dth> l2=new ArrayList<Dth>();
	for(Dth b:list)
	{
		
		if(b.getTransactionstatus().equalsIgnoreCase("failure"))
		{
			l2.add(b);
		}
				
	}
	model.addAttribute("flist",l2);
	return "GenerateVFailure";
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
@GetMapping("/vendorupdate")
public String vendorupdatepage(Model model,HttpSession session)
{
	String vendorid =(String) session.getAttribute("vendor");
	
	
	
	Vendor vendor = vs.getVendor(vendorid);

	model.addAttribute("edit",vendor);
	return "edit";
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
		int status=hs.savehelp(h);
		if(status==1)
		{
			model.addAttribute("success", "Congrats your Issue has been recorded  successfully");
		      
		
		}
		
		
		 model.addAttribute("message", "Congrats your Issue has been recorded  successfully");
		return "CusHelp";
		}
	}
}



