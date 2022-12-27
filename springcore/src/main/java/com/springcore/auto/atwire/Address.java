package com.springcore.auto.atwire;

public class Address { 
private String street;
private String cities;
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCities() {
	return cities;
}
public void setCities(String cities) {
	this.cities = cities;
}



@Override
public String toString() {
	return "Address [street=" + street + ", cities=" + cities + "]";
} 

}
