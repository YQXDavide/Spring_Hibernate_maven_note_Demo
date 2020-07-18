package com.yang.dao;

import java.util.List;

import com.yang.entity.Customer;

public interface CustomerDao {
	void saveCust();
	
	void updateCust();
	
	void deletCust();
	
	Customer selectOne(int id);
	
	List<Customer> selectAll();
}
