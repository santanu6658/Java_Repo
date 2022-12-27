package com.springcore.config;

//import org.springframework.stereotype.Component;

//@Component("firststudent")

public class Student {
	private Samosa samosa;
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	public Samosa getSamosa() {
		return samosa;
	}
	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	public void studey() {
		this.samosa.display();
		System.out.println("this is great");
	}

}
