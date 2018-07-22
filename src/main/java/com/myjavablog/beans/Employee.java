/**
 * 
 */
package com.myjavablog.beans;

/**
 * @author anupb
 *
 */
public class Employee {

	private String name;
	private Address address;

	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}

	
}
