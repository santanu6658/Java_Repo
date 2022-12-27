package com.springcore.lifecycle;

public class Chatuni {
private String  subject;

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

public Chatuni() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Chatuni [subject=" + subject + "]";
}


public void destroy()  {
	System.out.println("ending method");
}

public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	
}
}
