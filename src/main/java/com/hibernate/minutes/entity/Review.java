package com.hibernate.minutes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Review 
{
	@Id
	@GeneratedValue
	private Long id;
	
	private String description;
	
	private String rating;
	
	@ManyToOne
	private Course course;

	public Review()
	{
		
	}
	public Review(String rating, String description) {
		this.rating = rating;
		this.description = description;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Course getCourse() {
		return course;
	}
	
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Review [id=" + id + ", description=" + description + ", rating=" + rating + "]";
	}
	
}
