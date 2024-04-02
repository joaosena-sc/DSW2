package model;

import java.util.ArrayList;
import java.util.List;

public class ServiceManager{
	
	private static List<Service> services = new ArrayList<>();
	
	public static List<Service> getServices(){
		return services;
	}
	public static void addService(Service service){
		services.add(service);
	}
	public static void deleteService(int serviceId) {
		services.removeIf(service -> service.getServiceId() == serviceId);
	}
}
