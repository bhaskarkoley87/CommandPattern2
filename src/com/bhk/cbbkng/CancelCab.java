package com.bhk.cbbkng;

import com.bhk.entity.BookingRequest;

public class CancelCab implements CabService {

	private BookingRequest bookingRequest;
	
	public CancelCab(BookingRequest bookingRequest) {
		this.bookingRequest = bookingRequest;
	}
	
	public void cancelCab() {
		this.bookingRequest.cancel();
	}
	
	@Override
	public void execute() {
		this.cancelCab();	
	}

}
