package com.bill.billpayment.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bill.billpayment.domain.Aminlogin;


public interface Admindao extends CrudRepository<Aminlogin, String>
{

}
