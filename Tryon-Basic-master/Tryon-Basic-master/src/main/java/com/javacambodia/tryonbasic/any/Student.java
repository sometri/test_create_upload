package com.javacambodia.tryonbasic.any;

public class Student {
	private int id;
	private String name;
	private Gender gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return this.id + "->" + this.name + " is " + this.gender.getName();
	}
}
