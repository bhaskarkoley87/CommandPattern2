package com.bhk.entity;

public class CabBill {
	private String bookingRequestId;
	private String bookingCustomerId;
	private String bookingCabId;
	private String bookingLocation;
	private String bookingDestination;
	private double bookingTotalFare;
	
	
	public String getBookingRequestId() {
		return bookingRequestId;
	}
	public void setBookingRequestId(String bookingRequestId) {
		this.bookingRequestId = bookingRequestId;
	}
	public String getBookingCustomerId() {
		return bookingCustomerId;
	}
	public void setBookingCustomerId(String bookingCustomerId) {
		this.bookingCustomerId = bookingCustomerId;
	}
	public String getBookingCabId() {
		return bookingCabId;
	}
	public void setBookingCabId(String bookingCabId) {
		this.bookingCabId = bookingCabId;
	}
	public String getBookingLocation() {
		return bookingLocation;
	}
	public void setBookingLocation(String bookingLocation) {
		this.bookingLocation = bookingLocation;
	}
	public String getBookingDestination() {
		return bookingDestination;
	}
	public void setBookingDestination(String bookingDestination) {
		this.bookingDestination = bookingDestination;
	}
	public double getBookingTotalFare() {
		return bookingTotalFare;
	}
	public void setBookingTotalFare(double bookingTotalFare) {
		this.bookingTotalFare = bookingTotalFare;
	}
	
	public CabBill(String bookingRequestId, String bookingCustomerId, String bookingCabId, String bookingLocation,
			String bookingDestination, double bookingTotalFare) {	
		this.bookingRequestId = bookingRequestId;
		this.bookingCustomerId = bookingCustomerId;
		this.bookingCabId = bookingCabId;
		this.bookingLocation = bookingLocation;
		this.bookingDestination = bookingDestination;
		this.bookingTotalFare = bookingTotalFare;
	}
	
	public String toString() {
		StringBuffer strCabBill = new StringBuffer();
		strCabBill.append("\n--------------------------------------\n");
		strCabBill.append("Booking Request # : "+this.getBookingRequestId()+"\n");
		strCabBill.append("Custer Id : "+this.getBookingCustomerId()+"\n");
		strCabBill.append("Cab # : "+this.getBookingCabId()+"\n");
		strCabBill.append("Booking Location : "+this.getBookingLocation()+"\n");
		strCabBill.append("Booking Destination : "+this.getBookingDestination()+"\n");
		strCabBill.append("Booking Fare : "+this.getBookingTotalFare()+"\n");
		strCabBill.append("\n--------------------------------------\n");
		return strCabBill.toString();
	}
	
	
}
