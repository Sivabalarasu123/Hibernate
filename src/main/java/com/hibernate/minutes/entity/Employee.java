package com.hibernate.minutes.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.MappedSuperclass;

@Entity
//@MappedSuperclass   // -> It cannot be an Entity if annotated with this@MappedSuperClass
@Inheritance(strategy = InheritanceType.JOINED) //SINGLE_TABLE -> default
public abstract class Employee 
{
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable=false)
	private String name;

	public Employee()
	{
		
	}
	public Employee(String name) {
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}
