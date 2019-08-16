package com.bhk;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class Runner {
	public static void main(String[] args) {
		Runner obj = new Runner();
		Timer timer = new Timer();
		Thread myThread = new Thread(() -> {
		    System.out.println("The is started....");
		    try {
				TimeUnit.MINUTES.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    System.out.println("Cab reached to destination...");
		    try {
				TimeUnit.MINUTES.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    System.out.println("destination reached...");
		    //Object obj1 = new Object();
		    synchronized(obj) 
            { 
		    	obj.notify(); 
            } 
		});
		String pattern = "MM-dd-yyyy HH:mm";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		
		Calendar date = Calendar.getInstance();
		System.out.println(simpleDateFormat.format(date.getTime()));
		date.setTime(new Date());
		date.set(Calendar.HOUR, 6);
		date.set(Calendar.MINUTE, 02);
		date.set(Calendar.SECOND, 0);
		date.set(Calendar.MILLISECOND, 0);
		date.set(Calendar.AM_PM, Calendar.PM);
		
		System.out.println(simpleDateFormat.format(date.getTime()));
		// Schedule to run every Sunday in midnight
		timer.schedule(
		  new SampleTask(myThread),
		  date.getTime()
		);
		
		synchronized(obj) 
        { 
            //make the main thread wait 
			try {
				obj.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
              
            //once timer has scheduled the task 4 times,  
            //main thread resumes 
            //and terminates the timer 
            timer.cancel(); 
              
            //purge is used to remove all cancelled  
            //tasks from the timer'stak queue 
            System.out.println(timer.purge()); 
        } 
	}
}
