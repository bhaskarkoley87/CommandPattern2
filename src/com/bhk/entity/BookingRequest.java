package com.bhk.entity;

import com.bhk.utils.BookingServiceConstraints;

public class BookingRequest {
	private Cab cab;
	
	public BookingRequest(Cab cab) {
		this.cab = cab;
	}
	
	public void book() {
		this.cab.setStatus(BookingServiceConstraints.CAB_STATUS_BOOKED);
	}
	
	public void cancel() {
		this.cab.setStatus(BookingServiceConstraints.CAB_STATUS_AVAILABLE);
	}
}
