package com.training;

public class Invoice {

	private int id;
	private String name;
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Invoice(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Invoice [id=" + id + ", name=" + name + "]";
	}
	
	
}
