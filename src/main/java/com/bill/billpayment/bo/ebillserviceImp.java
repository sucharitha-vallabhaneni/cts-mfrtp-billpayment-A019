package com.bill.billpayment.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.bill.billpayment.dao.ebilldao;

import com.bill.billpayment.domain.electricity;
@Service
@Component
public class ebillserviceImp implements ebillservice
{
	@Autowired
	private ebilldao ebilldao;
	@Override
	public int savebill(electricity electricity) {
		electricity e= ebilldao.findByBillnumber(electricity.getBillnumber());
		if(e==null)
		{
			electricity e1=ebilldao.save(electricity);
			if(e1!=null)
			{
				return 1;
			}
			
	}
		return 0;
	}
	}


