package com.test.basic.web.entity;

import java.util.List;

public class User {
	
	private int id;
	private String name;
	private String serialId;
	private long cost;
	private String product;
	private List<AffectedPlaces> affectedPlaces;
	private long newPrice;
	private boolean isPriceChanged;
	
	public User(int id, String name, String serialId, long cost, String product) {
		super();
		this.id = id;
		this.name = name;
		this.serialId = serialId;
		this.cost = cost;
		this.product = product;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
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
	public String getSerialId() {
		return serialId;
	}
	public void setSerialId(String serialId) {
		this.serialId = serialId;
	}
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public List<AffectedPlaces> getAffectedPlaces() {
		return affectedPlaces;
	}
	public void setAffectedPlaces(List<AffectedPlaces> affectedPlaces) {
		this.affectedPlaces = affectedPlaces;
	}
	public long getNewPrice() {
		return newPrice;
	}
	public void setNewPrice(long newPrice) {
		this.newPrice = newPrice;
	}
	public boolean isPriceChanged() {
		return isPriceChanged;
	}
	public void setPriceChanged(boolean isPriceChanged) {
		this.isPriceChanged = isPriceChanged;
	}
	
	

}
