package com.springcore.constructor;

public class Addition {
	private int a;
	private int b;
	public Addition(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("int");
		

	}
	public Addition(double a,double b) {
		this.a=(int) (a);
		this.b=(int) b;
	System.out.println("double");
		

	}
	
	public void doSum() {
		System.out.println("sum"+(this.a+this.b));
	}

}
