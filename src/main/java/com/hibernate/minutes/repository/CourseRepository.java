package com.hibernate.minutes.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.minutes.entity.Course;
import com.hibernate.minutes.entity.Review;

import jakarta.persistence.EntityManager;

@Repository
@Transactional
public class CourseRepository 
{
	@Autowired
	EntityManager em;

	
	// findById
	
	public Course findById(Long id)
	{
		return em.find(Course.class, id);		
	}
	
	// save course
	
	public Course save(Course course)
	{
		if(course.getId() == null)
		{
			//insert
			em.persist(course);
		}else
		{
			//update
			em.merge(course);
		}
		return course;
	}
	
	// deleteById
	
	public void deleteById(Long id)
	{
		Course course = findById(id);
		em.remove(course);
	}

	public void addReviewsForCourse(Long courseId, List<Review> reviews) 
	{
		//get the course
		Course course = findById(courseId);
		
		
		for(Review review: reviews)
		{
		
		course.addReview(review);
		review.setCourse(course);
		
		// save reviews to DB
		em.persist(review);
		
		}
		
	}
}
