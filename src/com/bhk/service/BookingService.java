package com.bhk.service;

import java.util.ArrayList;
import java.util.List;

import com.bhk.cbbkng.CabService;
import com.bhk.entity.Customer;

public class BookingService {
	public static List<CabService> cabServiceBooking;
	public static List<CabService> cabServiceCancel;
	
	public BookingService() {
		cabService = new ArrayList<CabService>();
	}
	
	public void setCabBooking(CabService bookCabService, CabService calcelokCabService) {
		this.cabService.add(arg0)
	}
	
	public boolean bookCab(String loaction, Customer customer, CabService bookCabService) {
		 return true;
	}
	
	public boolean cabcelCab(String loaction, Customer customer, CabService calcelokCabService) {
		 return true;
	} 
}
