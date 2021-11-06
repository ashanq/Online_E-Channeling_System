package com.payment.bills;

public class Payments {
	private int id;
	private String patientName;
	private String special;
	private String doctorName;
	private String fee;
	private String date;
	private String time;
	public Payments(int id, String patientName, String special, String doctorName, String fee, String date,
			String time) {
		this.id = id;
		this.patientName = patientName;
		this.special = special;
		this.doctorName = doctorName;
		this.fee = fee;
		this.date = date;
		this.time = time;
	}
	public int getId() {
		return id;
	}
	
	public String getPatientName() {
		return patientName;
	}
	
	public String getSpecial() {
		return special;
	}
	
	public String getDoctorName() {
		return doctorName;
	}
	
	public String getFee() {
		return fee;
	}
	
	public String getDate() {
		return date;
	}
	
	public String getTime() {
		return time;
	}
	
	
	

}
