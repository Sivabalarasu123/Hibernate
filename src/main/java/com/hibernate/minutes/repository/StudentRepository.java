package com.hibernate.minutes.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.minutes.entity.Course;
import com.hibernate.minutes.entity.Passport;
import com.hibernate.minutes.entity.Student;

import jakarta.persistence.EntityManager;

@Repository
@Transactional
public class StudentRepository 
{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
			
	@Autowired
	EntityManager em;
	
	
	// findById
	
	public Student findById(Long id)
	{
		return em.find(Student.class, id);		
	}
	
	// save Student
	
	public Student save(Student student)
	{
		if(student.getId() == null)
		{
			//insert
			em.persist(student);
		}else
		{
			//update
			em.merge(student);
		}
		return student;
	}
	
	// deleteById
	
	public void deleteById(Long id)
	{
		Student student = findById(id);
		em.remove(student);
	}
	
	//save student with Passport
	
	public void saveStudentWithPassport()
	{
		Passport passport = new Passport("Z12345");
		em.persist(passport);
		
		Student student1 = new Student("Mike");
		student1.setPassport(passport);
		em.persist(student1);
			
	}
	
	public void insertStudentAndCourse()
	{
		Student student = new Student("Jack");
		Course course = new Course("Microservices in 75 steps");
		em.persist(student);
		em.persist(course);
		
		student.addCourses(course);
		course.addStudents(student);
		
		em.persist(student); //owning side
	}
}
