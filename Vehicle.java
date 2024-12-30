package com.vehicle;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vehicle {

	private String name;
	@Id
	private int id;
	private int prise;
	private String color;
	private String ComNmae;
	
	public Vehicle() {
		
	}

	public Vehicle(String name, int id, int prise, String color, String comNmae) {
		super();
		this.name = name;
		this.id = id;
		this.prise = prise;
		this.color = color;
		ComNmae = comNmae;
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

	public int getPrise() {
		return prise;
	}

	public void setPrise(int prise) {
		this.prise = prise;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getComNmae() {
		return ComNmae;
	}

	public void setComNmae(String comNmae) {
		ComNmae = comNmae;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", id=" + id + ", prise=" + prise + ", color=" + color + ", ComNmae=" + ComNmae
				+ "]";
	}
	
	
	
}
