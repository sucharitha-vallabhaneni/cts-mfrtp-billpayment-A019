package com.bill.billpayment.bo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bill.billpayment.dao.Creditdao;
import com.bill.billpayment.dao.ebilldao;
import com.bill.billpayment.domain.Credit;
import com.bill.billpayment.domain.electricity;


@Service
@Component
public class CreditserviceImp implements Creditservice
{
@Autowired
private Creditdao creditdao;
@Autowired
private ebilldao edao;

	@Override
	public boolean verify(Credit credit) {
		Optional<Credit> al=creditdao.findById(credit.getCardnumber());
		Credit ad=al.get();
		if(ad!=null)
		{
			return ad.getCvv().equals(credit.getCvv());
			
		}
		return false;
}
	
	@Override
	public boolean status(String billnumber) {
		electricity el=edao.findByBillnumber(billnumber);
		System.out.println(el);
		String s=el.getTransactionstatus();
		el.setTransactionstatus("success");
		electricity e2=edao.save(el);
		if(e2.getTransactionstatus().equals(s)) 
		{
		return false;
	}
		return true;
		}

	

	}
	
