package com.bhk.cbbkng;

import java.util.Date;

import com.bhk.entity.BookingRequest;

public class CancelCab implements CabService {

	private BookingRequest bookingRequest;
	
	
	public CancelCab() {
		this.bookingRequest = BookingRequest.getInstance();
	}	
	
	
	public void cancelCab(String bookingId) {
		this.bookingRequest.cancel(bookingId);
	}
	
	@Override
	public void execute(String bookingId, String pickupArea, String dropArea, Date dtPickUpTime) {
		this.cancelCab(bookingId);	
	}

}
