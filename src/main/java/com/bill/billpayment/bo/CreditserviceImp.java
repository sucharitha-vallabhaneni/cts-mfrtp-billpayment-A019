package com.bill.billpayment.bo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bill.billpayment.dao.Creditdao;

import com.bill.billpayment.domain.Credit;

@Service
@Component
public class CreditserviceImp implements Creditservice
{
@Autowired
private Creditdao creditdao;
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

}
