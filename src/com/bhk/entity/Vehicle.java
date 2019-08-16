package com.bhk.entity;

public interface Vehicle {
	public void setVehicleNo(String vhclNo);
	public String getVehicleNo();
	public void setLocation(String location);
	public String getLocation();
	public void setStatus(int status);
	public int getStatus();
	public String getBookingStartLocation();
	public void setBookingStartLocation(String bookingStartLocation);
	public String getBookingDestinantion();
	public void setBookingDestinantion(String bookingDestinantion);
}
