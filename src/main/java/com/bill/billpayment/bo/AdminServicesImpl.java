package com.bill.billpayment.bo;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bill.billpayment.dao.Admindao;
import com.bill.billpayment.dao.Vendordao;
import com.bill.billpayment.domain.Admin;

import com.bill.billpayment.domain.Adminlogin;
import com.bill.billpayment.domain.Vendor;
@Service
@Component
public class AdminServicesImpl implements AdminServices{
    @Autowired
	private Admindao dao;
    @Autowired
    private Vendordao vendordao;
	@Override
	public int createAdmin(Admin admin) {
		Admin ad=dao.findByAdminId(admin.getAdminId());
		if(ad!=null) {
			return 1;
		}else {
			Admin ad1=dao.save(admin);
			if(ad1!=null) {
				return 2;
			}
			else {
				return 3;
			}
		}
		
	}
	@Override
	public boolean loginVerification(Adminlogin adminlogin) {
		Admin admin=dao.findByAdminId(adminlogin.getUserid());
		if(admin!=null) {
			if(adminlogin.getPassword().equals(admin.getPassword())) {
				return true;
			}
		}
		return false;
	}
	@Override
	public List<Vendor> vendorList() {
		
		return vendordao.findAll();
	}


}
