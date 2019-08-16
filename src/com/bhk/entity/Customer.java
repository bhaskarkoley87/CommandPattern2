package com.bhk.entity;

public class Customer implements CustomerInterface {
	
	private String name;
	private String location;

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String getLocation() {
		return this.location;
	}

}
