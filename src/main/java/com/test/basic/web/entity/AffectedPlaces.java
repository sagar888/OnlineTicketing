package com.test.basic.web.entity;

public class AffectedPlaces {
	
	private int id;
	private String name;
	private long newPrice;
	
	public AffectedPlaces(int id, String name, long newPrice) {
		super();
		this.id = id;
		this.name = name;
		this.newPrice = newPrice;
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
	public long getNewPrice() {
		return newPrice;
	}
	public void setNewPrice(long newPrice) {
		this.newPrice = newPrice;
	}
	
	

}
