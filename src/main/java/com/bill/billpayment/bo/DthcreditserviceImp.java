package com.bill.billpayment.bo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bill.billpayment.dao.Dthbilldao;
import com.bill.billpayment.dao.Dthcreditdao;
import com.bill.billpayment.domain.Dth;
import com.bill.billpayment.domain.Dthcredit;

@Service
@Component
public class DthcreditserviceImp implements Dthcreditservice{
	@Autowired
	private Dthcreditdao dcdao;
	@Autowired
	private Dthbilldao ddao;

	@Override
	public boolean verify(Dthcredit credit) {
		Optional<Dthcredit> al=dcdao.findById(credit.getCardnumber());
		Dthcredit ad=al.get();
		if(ad!=null)
		{
			return ad.getCvv().equals(credit.getCvv());
			
		}
		return false;
}

	@Override
	public boolean dthstatus(String servicenumber) {
		Dth el=ddao.findByservicenumber(servicenumber);
		System.out.println(el);
		String s=el.getTransactionstatus();
		el.setTransactionstatus("success");
		Dth e2=ddao.save(el);
		if(e2.getTransactionstatus().equals(s)) 
		{
		return false;
	}
		return true;
		}
}
