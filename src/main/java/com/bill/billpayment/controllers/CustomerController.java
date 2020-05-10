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
import org.springframework.web.bind.annotation.RequestParam;

import com.bill.billpayment.domain.Credit;
import com.bill.billpayment.domain.Customer;
import com.bill.billpayment.bo.Creditservice;
import com.bill.billpayment.bo.Customerservice;
import com.bill.billpayment.bo.HelpService;
import com.bill.billpayment.bo.Recordbillsservice;
import com.bill.billpayment.bo.ebillservice;
import com.bill.billpayment.domain.Customerlogin;
import com.bill.billpayment.domain.Feedbackquestions;
import com.bill.billpayment.domain.Help;
import com.bill.billpayment.domain.Recordbills;
import com.bill.billpayment.domain.Reminders;
import com.bill.billpayment.domain.Security;
import com.bill.billpayment.domain.Security1;
import com.bill.billpayment.domain.Vendor;
import com.bill.billpayment.domain.electricity;

@Controller

public class CustomerController {
	@Autowired
	private Customerservice cs;
@Autowired
private Recordbillsservice rbs;
@Autowired
private ebillservice ebs;
@Autowired
private Creditservice credits;
@Autowired
private HelpService hs;
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
	public String customerRegisterForm(Model model,Model secmodel)
	{
		Customer customer=new Customer();
		model.addAttribute("cusreg", customer);
		Security1 secure = new Security1();
		 secmodel.addAttribute("securityque", secure);
		return "customerregistration";
	}

	//registering customer details
	@PostMapping("/cusregistration")
	public String registercustomer(@Valid @ModelAttribute("cusreg") Customer customer,@ModelAttribute("securityque") Security1 sec,BindingResult result,Model model)
	{
		if(result.hasErrors())
		{
			return "customerregistration";
		}
		
		else 
		{
			Customerlogin cuslogin = new Customerlogin();
			model.addAttribute("customer",cuslogin);
			sec.setUserId(customer.getUsername());
			customer.setSecurity1(sec);
			System.out.println(customer);
				
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
	

@GetMapping(value="/forgotcuserid")
public String forgetId(Model model) {
 return "ForgotCUserId"; }

 @PostMapping("/getCUserId") 
 public String getUserid(@RequestParam("mobile") String mobile,@RequestParam("secretquestion") String question,@RequestParam("answer") String answer,Model model) {
 
 System.out.println(question +" "+answer); 
 Security1 sc =cs.getSecurity1(mobile);
 System.out.println(sc); 
 if(sc==null)
{
	  model.addAttribute("message","Your contact number is not registered with us ");
	  return "ForgotCUserId";
 }
 
 if(question.equals(sc.getSecretquestion()) && answer.equals(sc.getAnswer()))
 {

	  model.addAttribute("message", "Your User Id is :<b>"+sc.getUserId());
	  return "ForgotCUserId"; 
	  } 
 else
 {
	  model.addAttribute("message","Invalid secret question credentials ");
	  return "ForgotCUserId";

}
 } 
@GetMapping(value="/forgotcpassword")
public String forgetPwd(Model model) {
 return "ForgotCPassword";
 }
 
 @PostMapping(value="/getcpwd")
 public String getPassword(@RequestParam("username") String userid,@RequestParam("secretquestion") String que,@RequestParam("answer") String ans, Model model,HttpSession session) { 
	  Security1 sc =cs.getSecurity1pwd(userid); 
	  System.out.println(sc); 
	  if(sc==null)
		 {
			 model.addAttribute("message", "Your UserId is not not registered with us ");
			 return "ForgotCPassword";
		 }
		 
		if(que.equals(sc.getSecretquestion()) && ans.equals(sc.getAnswer()))
		 {
			// model.addAttribute("message", "Your password is :<b>"+sc.getPassword());
			
			model.addAttribute("userid", sc.getUserId());
			 
			 return "ResetCPassword";	 
		 }
		 else
		 {
			 model.addAttribute("message", "Invalid secret question credentials ");
			 return "ForgotCPassword";
			
		 }

 }
 
 @PostMapping("/resetcpwd")
 public String resetPassword(@RequestParam("password")String pwd,@RequestParam("confirmationpassword")String cpwd,Model model,HttpSession session,
		 @RequestParam("username") String username
		 )
 {
 
//String userid = (String)session.getAttribute("username");
 

 if(pwd.equals(cpwd)) { 
	 Customer be =cs.getuserdata(username); 
	  be.setPassword(pwd);
	  be.setConfirmationpassword(cpwd);
	
 
 boolean status = cs.updatePassword(be);
 if(status == true) {
 
model.addAttribute("message", "reset password Sucessfully");
return"ResetCPassword"; 
}
 else
 {
	 model.addAttribute("message", "not reset"); 
     return "ResetCPassword"; 
 	}

}
 else
 {
	  model.addAttribute("message","new password and conformation are not same"); 
	  return "ResetCPassword";
	  }
 

 }


	
		@GetMapping("/feedback1")
		public String feedback1(Model model,HttpSession session)
		{
			String userid = (String)session.getAttribute("custusername");
			Feedbackquestions f=new Feedbackquestions();
			f.setUsername(userid);
			model.addAttribute("feedbk", f);
			return "FeedBackpage";
		}
		@PostMapping(value="/feedbackques")
		public String feedback(@ModelAttribute("feedbk")Feedbackquestions fdq,BindingResult result,Model model) {
			if(result.hasErrors())
			{
				return "FeedBackpage";
				
			}
			else {
				int res=cs.CreateFeedback(fdq);
				if(res==0)
				{
					
					model.addAttribute("message",fdq.getUsername()+" you are already submitted the feedback");
					return "FeedBackpage";
				}
				else if(res==1)
				{
					model.addAttribute("message",fdq.getUsername()+" you are successfully submitted the feedback");
					return "FeedBackpage";
				}
				else {
					model.addAttribute("message","something went wrong");
					return "FeedBackpage";
				}
			}
		
		}
		@GetMapping(value="/beforehelp")
		public String help(Model model)
		{
			model.addAttribute("help",new Help());
			return "CusHelp";
		}
		@PostMapping(value="/afterhelp")
		public String help1(@ModelAttribute("help") Help h,BindingResult result,Model model) {
			if(result.hasErrors())
			{
				return "CusHelp";
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




