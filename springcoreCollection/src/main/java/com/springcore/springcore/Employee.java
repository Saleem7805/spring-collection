package com.springcore.springcore;

import java.util.List;
import java.util.Map;
import java.util.Set;

//import org.springframework.core.convert.Property;

public class Employee {
	private String name;
	private List<String>phones;
	private Set<String>addresses;
	private Map<String,String>courses;
	//private Property details;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
//	public Property getDetails() {
//		return details;
//	}
//	public void setDetails(Property details) {
//		this.details = details;
//	}
	public Employee(String name, List<String> phones, Set<String> addresses, Map<String, String> courses) {
		super();
		this.name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
//		this.details = details;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", phones=" + phones + ", addresses=" + addresses + ", courses=" + courses+"]";
	}
	

}
