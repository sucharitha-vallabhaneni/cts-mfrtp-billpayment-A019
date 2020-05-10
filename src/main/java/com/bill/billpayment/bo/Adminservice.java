package com.bill.billpayment.bo;

import java.util.List;

import com.bill.billpayment.domain.Aminlogin;
import com.bill.billpayment.domain.Dth;
import com.bill.billpayment.domain.Vendor;
import com.bill.billpayment.domain.electricity;

public interface Adminservice 
{
public boolean login(Aminlogin adminlogin);
public List<Vendor> getallvendors();
public boolean activate(String username);
public boolean deactivate(String username);
public List<electricity> getelectricbills();
public List<Dth> getdthbills();
}
