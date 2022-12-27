package com.springcore.ref;

public class A {
	private int x;
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	private B ob;

	public B getOb() {
		return ob;
	}

	public void setOb(B ob) {
		this.ob = ob;
	}

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "A [ob=" + ob + "]";
	}
	

}
