package com.bill.billpayment.bo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bill.billpayment.dao.HelpDao;
import com.bill.billpayment.domain.Help;

@Service
@Component

public class HelpServicesImpl implements HelpService {
    @Autowired
    private HelpDao hdao;
	@Override
	public List<Help> helplist() {
		
		return hdao.findAll();
	} 

}
