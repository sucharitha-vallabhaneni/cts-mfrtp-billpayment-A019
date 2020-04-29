package com.bill.billpayment.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bill.billpayment.dao.Recordbillsdao;

import com.bill.billpayment.domain.Recordbills;
@Service
@Component
public class RecordbillsserviceImp implements Recordbillsservice
{
@Autowired
private Recordbillsdao rbdao;
	@Override
	public int savebills(Recordbills recordbill)
	{
		Recordbills rb= rbdao.findByBillnumber(recordbill.getBillnumber());
		if(rb==null)
		{
			Recordbills rb1=rbdao.save(recordbill);
			if(rb1!=null)
			{
				return 1;
			}
			
	}
		return 0;
	}
}

	


