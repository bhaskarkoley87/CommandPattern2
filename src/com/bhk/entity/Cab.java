package com.bhk.entity;

public class Cab implements Vehicle {
	private String vhclNo;
	private String location;
	private String bookingStartLocation;
	private String bookingDestinantion;
	private int status;

	@Override
	public void setVehicleNo(String vhclNo) {
		this.vhclNo = vhclNo;
	}

	@Override
	public String getVehicleNo() {
		return this.vhclNo;
	}

	@Override
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String getLocation() {
		return this.location;
	}

	@Override
	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public int getStatus() {		
		return this.status;
	}

	public String getBookingStartLocation() {
		return bookingStartLocation;
	}

	public void setBookingStartLocation(String bookingStartLocation) {
		this.bookingStartLocation = bookingStartLocation;
	}

	public String getBookingDestinantion() {
		return bookingDestinantion;
	}

	public void setBookingDestinantion(String bookingDestinantion) {
		this.bookingDestinantion = bookingDestinantion;
	}
	
}
