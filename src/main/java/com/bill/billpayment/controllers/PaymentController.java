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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bill.billpayment.bo.Creditservice;
import com.bill.billpayment.bo.Customerservice;
import com.bill.billpayment.bo.Dthbillservice;
import com.bill.billpayment.bo.Dthcreditservice;
import com.bill.billpayment.bo.Dthgpayservice;
import com.bill.billpayment.bo.Gpayservice;
import com.bill.billpayment.bo.ebillservice;

import com.bill.billpayment.domain.Credit;
import com.bill.billpayment.domain.Customer;
import com.bill.billpayment.domain.Dth;
import com.bill.billpayment.domain.Dthcredit;
import com.bill.billpayment.domain.Dthgpay;
import com.bill.billpayment.domain.Gpay;
import com.bill.billpayment.domain.Recordbills;
import com.bill.billpayment.domain.electricity;

@Controller
public class PaymentController {
	@Autowired
	private ebillservice ebs;
	@Autowired
	private Creditservice credits;
	
	@Autowired
	private Customerservice cs;
	@Autowired
	private Gpayservice gpays;
	@Autowired
	private Dthbillservice dths;
	@Autowired
	private Dthcreditservice dthcs;
	@Autowired
	private Dthgpayservice dthgs;
	//for redirecting to bill payment home page
		@GetMapping("billpayhome")
		public String billhomepage(Model model)
		{
			return "billpaymenthome";
		}
		
		
		
		//electricity home page
		@GetMapping("electricity")
		public String elechomepage(Model model)
		{
			
		electricity e=new electricity();
		model.addAttribute("electricity",e);
			return "electricity";
		}
		//e-bill saving
		@PostMapping("ebillsave")
		public String saveebills(@Valid @ModelAttribute("electricity")electricity e ,BindingResult result,Model model,HttpSession session)
		{
			e.setTransactionstatus("failure");
			if(result.hasErrors())
			{
				return "electricity";
			}
			
			else 
			{
				
				String custusername=(String) session.getAttribute("custusername");
				Customer c = cs.getCustomer(custusername);
				
				e.setCustomeruname(c);

						int res = ebs.savebill(e);
			
			 if(res==1)
			{
				
			     model.addAttribute("billnumber", e.getBillnumber());
				return "electpaymentmethod";
			}
			return "electpaymentmethod";
			}
		
		}
		//elec pay mode
		@PostMapping("getPaymetMode")
		public String getPaymentmethod(Model model,@RequestParam("bl")String billnumber,RedirectAttributes redirects,@RequestParam("pmethod") String mode)
		{
			
			if(mode.equals("credit"))
			{
			redirects.addFlashAttribute("billno", billnumber);
		
			return "redirect:pay";
			}
			else if(mode.equals("gpay"))
			{
				redirects.addFlashAttribute("billno", billnumber);
				
				return "redirect:gpay";
			}
			else
			{
             redirects.addFlashAttribute("billno", billnumber);
				
				return "redirect:gpay";
			}
		}
		//gpay page
		@GetMapping("gpay")
		public String googlePayMode(Model model)
		{
			Gpay gp = new Gpay();
			model.addAttribute("vergpay", gp);
			return "Gpay";
		}
		//gpay verification
		@PostMapping("gverify")
		public String gpayverify(@Valid @ModelAttribute("vergpay") Gpay gpay,Model model,HttpSession session,BindingResult result,@RequestParam("bil") String billnumber)
		{
			if(result.hasErrors())	
			{
				return "Gpay";
			}
			else
			{
				boolean status=gpays.verify(gpay);
				if(status)
				{
					
					session.setAttribute("user", gpay.getContactNumber());
				gpays.status(billnumber);
					
				 return "success";
				 
						
				}
			
				else
				{
				model.addAttribute("message", "Invalid ");
					return "Gpay";
				}

		}
		}	
		
	//credit page
		@GetMapping("pay")
		public String paypagecred(Model model)
		{
			Credit credit=new Credit();
			model.addAttribute("verifypay",credit);
			return "credit";
		}
		
		//credit verification
		@PostMapping("verify")
		public String creditverify(@Valid @ModelAttribute("verifypay") Credit credit,Model model,HttpSession session,BindingResult result,@RequestParam("bil") String billnumber)
		{
			
			if(result.hasErrors())	
			{
				return "credit";
			}
			else
			{
				boolean status=credits.verify(credit);
				if(status)
				{
					
					session.setAttribute("user", credit.getCardnumber());
				
					credits.status(billnumber);
				 return "success";
				 
						
				}
			
				else
				{
				model.addAttribute("message", "Invalid ");
					return "credit";
				}

		}
		}	
		//electricity bill history
		@GetMapping("ebillhistory")
		public String display(HttpSession session,Model model)
		{
			List<electricity> elist=cs.geElectricities();
			model.addAttribute("ebill",elist);
		
			return "ebillhistory";
		}
		//dth home page
				@GetMapping("dth")
				public String dthpage(Model model)
				{
					Dth d=new Dth();
					model.addAttribute("dth",d);
					return "DTH";
				}
				//dth bill saving
				@PostMapping("dthsave")
				public String savedthbill(@Valid @ModelAttribute("dth")Dth d,BindingResult result,Model model,HttpSession session)
				{
					d.setTransactionstatus("failure");
					if(result.hasErrors())
					{
						return "DTH";
					}
					else
					{
						String custusername=(String) session.getAttribute("custusername");
						Customer c = cs.getCustomer(custusername);
						d.setCustomeruname(c);
						

								int res = dths.savebill(d);
					
					 if(res==1)
					{
						
					     model.addAttribute("billnumber", d.getServicenumber());
						return "dthpaymentmethod";
					}
					return "dthpaymentmethod";
					}
				
					}
				//dth payment method
				
				@PostMapping("getdthPaymetMode")
				public String getdthPaymentmethod(Model model,@RequestParam("bl")String billnumber,RedirectAttributes redirects,@RequestParam("pmethod") String mode)
				{
					
					if(mode.equals("credit"))
					{
					redirects.addFlashAttribute("billno", billnumber);
				
					return "redirect:dthcpay";
					}
					else if(mode.equals("gpay"))
					{
						redirects.addFlashAttribute("billno", billnumber);
						
						return "redirect:dthgpay";
					}
					else
					{
		             redirects.addFlashAttribute("billno", billnumber);
						
						return "redirect:dthgpay";
					}
				}
				//dthgpay page
				@GetMapping("dthgpay")
				public String dthgooglePayMode(Model model)
				{
					Dthgpay gp = new Dthgpay();
					model.addAttribute("vergpay", gp);
					return "dthgpay";
				}
				//dthgpay verification
				@PostMapping("dthgverify")
				public String dthgpayverify(@Valid @ModelAttribute("vergpay") Dthgpay gpay,Model model,HttpSession session,BindingResult result,@RequestParam("bil") String billnumber)
				{
					if(result.hasErrors())	
					{
						return "dthpay";
					}
					else
					{
						boolean status=dthgs.verify(gpay);
						if(status)
						{
							
							session.setAttribute("user", gpay.getContactNumber());
						dthgs.dstatus(billnumber);
							
						 return "success";
						 
								
						}
					
						else
						{
						model.addAttribute("message", "Invalid ");
							return "Gpay";
						}

				}
				}	
				//dthcredit page
				@GetMapping("dthcpay")
				public String dthpaypagecred(Model model)
				{
					Dthcredit credit=new Dthcredit();
					model.addAttribute("verifypay",credit);
					return "credit";
				}
				
				//credit verification
				@PostMapping("dthcverify")
				public String dthcreditverify(@Valid @ModelAttribute("verifypay") Dthcredit credit,Model model,HttpSession session,BindingResult result,@RequestParam("bil") String billnumber)
				{
					
					if(result.hasErrors())	
					{
						return "credit";
					}
					else
					{
						boolean status=dthcs.verify(credit);
						if(status)
						{
							
							session.setAttribute("user", credit.getCardnumber());
						
							dthcs.dthstatus(billnumber);
						 return "success";
						 
								
						}
					
						else
						{
						model.addAttribute("message", "Invalid ");
							return "credit";
						}

				}
				}	
		//dth bill history
		@GetMapping("dthbillhistory")
		public String ddisplay(HttpSession session,Model model)
		{
			List<Dth> dlist=cs.getDth();
			model.addAttribute("dbill",dlist);
			return "dthbillhistory";
		}
		//recorded bills history
		@GetMapping("recbillhistoty")
		public String recbdisplay(HttpSession session,Model model)
		{
			List<Recordbills> rlist=cs.getrecbills();
			model.addAttribute("rbill",rlist);
			return "recbillhistory";
	}
}



