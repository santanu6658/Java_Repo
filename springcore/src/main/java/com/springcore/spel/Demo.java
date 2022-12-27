package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Demo {
	@Value("#{22+11}")
	private int x;
	@Value("#{45+258}")
	private int y;
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private int z;
	@Value("#{ new java.lang.String('sanyanu') }")
	private String name;
	@Value("#{8>3}")
	private boolean isActive;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", name=" + name + ", isActive=" + isActive + "]";
	}

	

}

