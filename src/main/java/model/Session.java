package model;

public class Session {
	private static int count=1;
	private int id;
	private int serviceId;
	private long dateTime;
	
	public Session(int serviceId,long date) {
		this.id = count++;
		this.serviceId = serviceId;
		this.dateTime = dateTime;
	}
	public static int getSessionCount() {
		return count;
	}
	public int getSessionId() {
		return this.id;
	}
	
	public int getSessionServiceId() {
		return this.serviceId;
	}
	public long getSessionDateTime() {
		return this.dateTime;
	}
}
