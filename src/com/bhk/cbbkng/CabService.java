package com.bhk.cbbkng;

import java.util.Date;

public interface CabService {
	public void execute(String bookingId, String pickupArea, String dropArea, Date dtPickUpTime);
}
