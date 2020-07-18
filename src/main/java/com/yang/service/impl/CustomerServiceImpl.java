package com.yang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.yang.dao.CustomerDao;
import com.yang.entity.Customer;
import com.yang.service.CustomerService;

@Service("customerService")
@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;
	@Override
	public void saveCust() {
		customerDao.saveCust();

	}

	@Override
	public void updateCust() {
		customerDao.updateCust();

	}

	@Override
	public void deletCust() {
		customerDao.deletCust();

	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public Customer selectOne(int id) {
		
		return customerDao.selectOne(id);
	}

	@Override
	public List<Customer> selectAll() {
		
		return customerDao.selectAll();
	}

}
