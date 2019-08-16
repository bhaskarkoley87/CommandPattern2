package com.bhk.cbbkng.pool;

import java.util.TimerTask;

public class SchedulerTask extends TimerTask {
	Thread myThreadObj;

	SchedulerTask(Thread t) {
		this.myThreadObj = t;
	}

	public void run() {
		myThreadObj.start();
		
	}
}
