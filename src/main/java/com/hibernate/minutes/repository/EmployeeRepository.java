package com.hibernate.minutes.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.minutes.entity.Course;
import com.hibernate.minutes.entity.Employee;

import jakarta.persistence.EntityManager;

@Repository
@Transactional
public class EmployeeRepository 
{
	@Autowired
	EntityManager em;
	
	//private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	//insert an employee
	public void insertEmployee(Employee employee)
	{
		em.persist(employee);
	}
	
	//retrieve all employee
	public List<Employee> retrieveAllEmployees()
	{
		return em.createQuery("select e from Employee e",Employee.class).getResultList();
	}
		
}
