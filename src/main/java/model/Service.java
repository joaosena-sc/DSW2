package model;

public class Service {
	private static int count=1;
	private int id;
	private String name;
	private String description;
	private float price;
	
	public Service(String name, String description, float price) {
		this.id = count++;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public static int getServiceCount() {
		return count;
	}
	public int getServiceId() {
		return this.id;
	}
	public String getServiceName() {
		return this.name;
	}
	public String getServiceDescription() {
		return this.description;
	}
	public float getServicePrice() {
		return this.price;
	}
}
