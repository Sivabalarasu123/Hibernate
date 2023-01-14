package com.hibernate.minutes.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.minutes.entity.Course;

@SpringBootTest
class CourseRepositoryTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseRepository courseRepository;
	
	@Test
	public void findById_basic() 
	{
		Course course = courseRepository.findById(10001L);
		assertEquals("JPA in 50 steps", course.getName());
	}
	
	@Test
	@DirtiesContext
	public void deleteById_basic() 
	{
		courseRepository.deleteById(10003L);	
		assertNull(courseRepository.findById(10003L));
	}
	
	@Test
	@DirtiesContext
	public void save_basic() 
	{
		//get a course
		Course course = courseRepository.findById(10002L);
		assertEquals("SpringBoot in 50 steps", course.getName());
		
		// update detils
		course.setName("SpringBoot in 50 steps - Updated");
		courseRepository.save(course);
		
		//check the value
		Course course1 = courseRepository.findById(10002L);
		assertEquals("SpringBoot in 50 steps - Updated", course1.getName());
	}
	
	@Test
	@Transactional
	public void retrieveReviewsForCourse()
	{
		Course course = courseRepository.findById(10003L);
		logger.info("{}",course.getReviews());
	}
		

}
