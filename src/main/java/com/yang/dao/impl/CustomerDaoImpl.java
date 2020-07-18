package com.yang.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.yang.dao.CustomerDao;
import com.yang.entity.Customer;

@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public void saveCust() {
		Customer cust = new Customer();
		cust.setCustName("孙悟空");
		cust.setCustAddress("花果山");
		cust.setCustLevel("级别2");
		cust.setCustPhone("15235373803");
		hibernateTemplate.save(cust);
	}

	@Override
	public void updateCust() {
		

	}

	@Override
	public void deletCust() {
		// TODO Auto-generated method stub

	}

	@Override
	public Customer selectOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
