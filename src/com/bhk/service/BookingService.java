package com.bhk.service;

import java.util.Date;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

import com.bhk.cbbkng.BookingCab;
import com.bhk.cbbkng.CabService;
import com.bhk.cbbkng.CancelCab;
import com.bhk.entity.BookingRequest;
import com.bhk.entity.Cab;
import com.bhk.entity.Customer;
import com.bhk.utils.BookingServiceConstraints;

public class BookingService {
	private CabService[] cabService;	
	private BookingRequest bookingRequest = BookingRequest.getInstance();
	
	
	public BookingService() {
		cabService = new CabService[2];	
		cabService[0] = new BookingCab();
		cabService[1] = new CancelCab();
	}	
	
	
	public void bookCab(String bookingId, String pickupArea, String dropArea, Date dtPickUpTime) {		
		this.cabService[0].execute(bookingId, pickupArea, dropArea, dtPickUpTime);
	}
	
	public void cabcelCab(String bookingId, String pickupArea, String dropArea, Date dtPickUpTime) {
		this.cabService[1].execute(bookingId, pickupArea, dropArea, dtPickUpTime);
	} 
}
