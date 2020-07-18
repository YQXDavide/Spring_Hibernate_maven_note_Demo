package com.yang.service;

import java.util.List;

import com.yang.entity.Customer;

public interface CustomerService {
	void saveCust();
	
	void updateCust();
	
	void deletCust();
	
	Customer selectOne(int id);
	
	List<Customer> selectAll();
}
