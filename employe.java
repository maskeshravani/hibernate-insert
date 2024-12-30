package com.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class employe {

	private String name;
	@Id
	private int id;
	private String address;
	private int salary;
	private long mobno;
	public employe() {
		
	}
	public employe(String name, int id, String address, int salary, long mobno) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.salary = salary;
		this.mobno = mobno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	@Override
	public String toString() {
		return "employe [name=" + name + ", id=" + id + ", address=" + address + ", salary=" + salary + ", mobno="
				+ mobno + "]";
	}
	

}
