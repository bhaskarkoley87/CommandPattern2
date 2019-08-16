package com.bhk.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

import com.bhk.utils.BookingServiceConstraints;

public class BookingRequest {
	public static ConcurrentHashMap<String, Cab> listOfCab =  new ConcurrentHashMap<String, Cab>();	
	public static ConcurrentHashMap<String, Cab> listOfBooking =  new ConcurrentHashMap<String, Cab>();	
	private static BookingRequest bookingRequest;
	
	private BookingRequest() {
		
	}
	
	public static BookingRequest getInstance() {
		if(bookingRequest == null) {
			bookingRequest = new BookingRequest();
		}		
		return bookingRequest;
	}	
	
		
	public void book(String bookingId, String pickupArea, String dropArea, Date dtPickUpTime) {		
		Cab cab;
		TreeMap<Long, Cab> listOfAvailableCabs = new TreeMap<Long, Cab>();
		cab.setStatus(BookingServiceConstraints.CAB_STATUS_BOOKED);
		listOfCab.put(cab.getVehicleNo(), cab);
	}
	
	public void cancel(String bookingId) {
		Cab cab;
		if(listOfBooking.contains(bookingId)) {
			cab = listOfBooking.get(bookingId);
			cab.setStatus(BookingServiceConstraints.CAB_STATUS_AVAILABLE);
			if(listOfCab.contains(cab.getVehicleNo())) {
				listOfCab.put(cab.getVehicleNo(), cab);
				System.out.println("You Cab request has been canceled for booking id : "+bookingId);
			}
		}
		
	}
}
