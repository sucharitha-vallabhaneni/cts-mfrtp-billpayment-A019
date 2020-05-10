package com.bill.billpayment.bo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bill.billpayment.dao.Admindao;
import com.bill.billpayment.dao.Dthbilldao;
import com.bill.billpayment.dao.HelpDao;
import com.bill.billpayment.dao.Vendordao;
import com.bill.billpayment.dao.ebilldao;
import com.bill.billpayment.domain.Aminlogin;
import com.bill.billpayment.domain.Dth;
import com.bill.billpayment.domain.Help;
import com.bill.billpayment.domain.Vendor;
import com.bill.billpayment.domain.electricity;
@Service
@Component
public class AdminserviceImp implements Adminservice
{
@Autowired
private Admindao adao;
@Autowired
private Vendordao vendordao;
@Autowired
private ebilldao dao;
@Autowired
private Dthbilldao ddao;
@Autowired
private HelpDao hdao;
	@Override
	public boolean login(Aminlogin adminlogin)
	{
		Optional<Aminlogin> al=adao.findById(adminlogin.getUsername());
		Aminlogin ad=al.get();
		if(ad!=null)
		{
			return ad.getPassword().equals(adminlogin.getPassword());
		}
		return false;
}
	@Override
	public List<Vendor> getallvendors() {
		// TODO Auto-generated method stub
		return vendordao.findAll();
}
	@Override
	public boolean activate(String username) {
		Vendor v=vendordao.findByUsername(username);
		String s=v.getStatus();
		v.setStatus("active");
		Vendor v1=vendordao.save(v);
		if(v1.getStatus().equals(s)) {
		return false;
	}
		return true;
		}
	@Override
	public boolean deactivate(String username) {
		Vendor v=vendordao.findByUsername(username);
		String s=v.getStatus();

		v.setStatus("deactivated");
		Vendor v1=vendordao.save(v);
		if(v1.getStatus().equals(s)) {
		return false;
	}
		return true;
	}
	@Override
	public List<electricity> getelectricbills() {
		
		Iterable<electricity> list=dao.findAll();
		return (List<electricity>) list;
		
	}
	@Override
	public List<Dth> getdthbills() {
		Iterable<Dth> list=ddao.findAll();
		return (List<Dth>) list;
		
	}
	@Override
	public List<Help> getallhelpList() {
		// TODO Auto-generated method stub
		return hdao.findAll();
	}
	


}	
