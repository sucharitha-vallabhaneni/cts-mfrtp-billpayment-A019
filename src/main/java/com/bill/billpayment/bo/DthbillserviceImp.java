package com.bill.billpayment.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bill.billpayment.dao.Dthbilldao;
import com.bill.billpayment.domain.Dth;

@Service
@Component
public class DthbillserviceImp implements Dthbillservice
{
@Autowired
private Dthbilldao ddao;
	@Override
	public int savebill(Dth dth) {
		Dth e= ddao.findByservicenumber(dth.getServicenumber());
		if(e==null)
		{
			Dth e1=ddao.save(dth);
			if(e1!=null)
			{
				return 1;
			}
			
	}
		return 0;
	}
}
