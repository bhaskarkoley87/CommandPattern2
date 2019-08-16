package com.bhk.cbbkng;

import com.bhk.entity.BookingRequest;

public class BookingCab implements CabService {

	private BookingRequest bookingRequest;
	
	public BookingCab(BookingRequest bookingRequest) {
		this.bookingRequest = bookingRequest;
	}
	
	public void bookCab() {
		this.bookingRequest.book();
	}
	
	@Override
	public void execute() {
		this.bookCab();	
	}

}
