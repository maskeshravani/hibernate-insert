package com.student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Stud {

	private String name;
	@Id
	private int rollNo;
	private String address;
	private int marks;
	private long mobino;
	
	public Stud() {
		
	}

	public Stud(String name, int rollNo, String address, int marks, long mobino) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.address = address;
		this.marks = marks;
		this.mobino = mobino;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public long getMobino() {
		return mobino;
	}

	public void setMobino(long mobino) {
		this.mobino = mobino;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", rollNo=" + rollNo + ", address=" + address + ", marks=" + marks
				+ ", mobino=" + mobino + "]";
	}
	
	
}
