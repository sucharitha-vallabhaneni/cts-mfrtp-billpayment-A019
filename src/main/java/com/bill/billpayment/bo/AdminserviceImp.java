package com.bill.billpayment.bo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bill.billpayment.dao.Admindao;
import com.bill.billpayment.dao.Vendordao;
import com.bill.billpayment.domain.Aminlogin;
import com.bill.billpayment.domain.Vendor;
@Service
@Component
public class AdminserviceImp implements Adminservice
{
@Autowired
private Admindao adao;
@Autowired
private Vendordao vendordao;
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
	}	}	
