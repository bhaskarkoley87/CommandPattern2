package com.bhk.cbbkng;

import java.util.Date;

import com.bhk.entity.BookingRequest;
import com.bhk.entity.Cab;

public class BookingCab implements CabService {

	private BookingRequest bookingRequest;	
	
	public BookingCab() {
		this.bookingRequest = BookingRequest.getInstance();		
	}
	
	public BookingRequest getBookingRequest() {
		return this.bookingRequest;
	}
	
	public void bookCab(String bookingId, String pickupArea, String dropArea, Date dtPickUpTime) {
		this.bookingRequest.book(bookingId, pickupArea, dropArea, dtPickUpTime);
	}
	
	@Override
	public void execute(String bookingId, String pickupArea, String dropArea, Date dtPickUpTime) {
		this.bookCab(bookingId, pickupArea, dropArea, dtPickUpTime);	
	}

}
