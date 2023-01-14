package com.hibernate.minutes.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Passport 
{
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable=false)
	private String number;

	public Passport()
	{
		
	}
	public Passport(String number) {
		this.number = number;
	}
	
	public Long getId() {
		return id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	

	@Override
	public String toString() {
		return "Passport [id=" + id + ", number=" + number + "]";
	}
	
}
