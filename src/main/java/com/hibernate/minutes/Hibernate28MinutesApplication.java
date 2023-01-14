package com.hibernate.minutes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibernate.minutes.entity.FullTimeEmployee;
import com.hibernate.minutes.entity.PartTimeEmployee;
import com.hibernate.minutes.entity.Review;
import com.hibernate.minutes.repository.CourseRepository;
import com.hibernate.minutes.repository.EmployeeRepository;
import com.hibernate.minutes.repository.StudentRepository;

@SpringBootApplication
public class Hibernate28MinutesApplication implements CommandLineRunner{

	@Autowired
	CourseRepository courseRepository;
	
	// PERSISTENT CONTEXT = SESSION => give access to database, in session, diff entites are stored.
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public static void main(String[] args) {
		SpringApplication.run(Hibernate28MinutesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	 employeeRepository.insertEmployee
		(new PartTimeEmployee("Jill", new BigDecimal("50")));	
		
	 employeeRepository.insertEmployee
		(new FullTimeEmployee("Jack", new BigDecimal("10000")));
				
	 logger.info("All Employees -> {}",employeeRepository.retrieveAllEmployees());
	 
		
		/* List<Review> reviews = new ArrayList<>();
		
		reviews.add(new Review("4","Fantastic course"));
		reviews.add(new Review("5","Excellent course"));
	
		courseRepository.addReviewsForCourse(10003L,reviews);
		
		studentRepository.saveStudentWithPassport();
		
		 Course course = courseRepository.findById(10001L);
		
		logger.info("Course 10001 --> {}",course);
		
		courseRepository.save(new Course("Spring MVC in 50 steps"));
		
		studentRepository.insertStudentAndCourse();
		*/
	}
	

}
