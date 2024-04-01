package model;

public class Session {
	private int id;
	private int serviceId;
	private String date;
	private String time;
	
	public Session(int serviceId,String date,String time) {
		this.serviceId = serviceId;
		this.date = date;
		this.time = time;
	}
	
	public int getSessionServiceId() {
		return this.serviceId;
	}
	public String getSessionDate() {
		return this.date;
	}
	public String getSessionTime() {
		return this.time;
	}
}
