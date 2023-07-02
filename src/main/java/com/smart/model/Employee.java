package com.smart.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	
	private int Id;
	private String name;
	private int age;
	private String State;
	private String Type;
	private int Salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNmae() {
		return name;
	}

	public void setNmae(String nmae) {
		this.name = nmae;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public Employee(int id, String nmae, int age, String state, String type, int salary) {
		super();
		Id = id;
		this.name = nmae;
		this.age = age;
		State = state;
		Type = type;
		Salary = salary;
	
	}
	
	
	
	
	

}
