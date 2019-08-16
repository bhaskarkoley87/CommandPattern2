package com.bhk.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CabBookingRequestInfo {
	CabBill cabBill;
	private double dblTotalCost;
	private double dblProfitAmout;
	private double dblProfitPerct;
	private Date dtBookingTime;
	private Date dtCabReportingTime;
	private Date dtCabDestinationTime;
	String pattern = "MM-dd-yyyy HH:mm";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	
	
	public CabBill getCabBill() {
		return cabBill;
	}
	public void setCabBill(CabBill cabBill) {
		this.cabBill = cabBill;
	}
	public double getDblTotalCost() {
		return dblTotalCost;
	}
	public void setDblTotalCost(double dblTotalCost) {
		this.dblTotalCost = dblTotalCost;
	}
	public double getDblProfitAmout() {
		return dblProfitAmout;
	}
	public void setDblProfitAmout(double dblProfitAmout) {
		this.dblProfitAmout = dblProfitAmout;
	}
	public double getDblProfitPerct() {
		return dblProfitPerct;
	}
	public void setDblProfitPerct(double dblProfitPerct) {
		this.dblProfitPerct = dblProfitPerct;
	}	
	public Date getDtBookingTime() {
		return dtBookingTime;
	}
	public void setDtBookingTime(Date dtBookingTime) {
		this.dtBookingTime = dtBookingTime;
	}
	public Date getDtCabReportingTime() {
		return dtCabReportingTime;
	}
	public void setDtCabReportingTime(Date dtCabReportingTime) {
		this.dtCabReportingTime = dtCabReportingTime;
	}
	public Date getDtCabDestinationTime() {
		return dtCabDestinationTime;
	}
	public void setDtCabDestinationTime(Date dtCabDestinationTime) {
		this.dtCabDestinationTime = dtCabDestinationTime;
	}
	
	
	
	
	public CabBookingRequestInfo(CabBill cabBill, double dblTotalCost, double dblProfitAmout, double dblProfitPerct,
			Date dtBookingTime, Date dtCabReportingTime, Date dtCabDestinationTime) {	
		this.cabBill = cabBill;
		this.dblTotalCost = dblTotalCost;
		this.dblProfitAmout = dblProfitAmout;
		this.dblProfitPerct = dblProfitPerct;
		this.dtBookingTime = dtBookingTime;
		this.dtCabReportingTime = dtCabReportingTime;
		this.dtCabDestinationTime = dtCabDestinationTime;
	}
	public String toString() {
		StringBuffer cabRequestInfo = new StringBuffer();
		cabRequestInfo.append("\n=======================================================\n");
		cabRequestInfo.append("Cab Total Cost : "+this.getDblTotalCost()+"\n");
		cabRequestInfo.append("Cab Profit Amount : "+this.getDblProfitAmout()+"\n");
		cabRequestInfo.append("Cab Profit Percentage : "+this.dblProfitPerct+"\n");
		cabRequestInfo.append("Cab Booking Time : "+this.simpleDateFormat.format(this.getDtBookingTime())+"\n");
		cabRequestInfo.append("Cab Reporting Time : "+this.simpleDateFormat.format(this.getDtCabReportingTime())+"\n");
		cabRequestInfo.append("Cab Destination Time : "+this.simpleDateFormat.format(this.getDtCabDestinationTime())+"\n");
		cabRequestInfo.append("Cab Customer Bill : \n");
		cabRequestInfo.append(this.getCabBill().toString());
		cabRequestInfo.append("\n=======================================================\n");
		return cabRequestInfo.toString();
	}

}
