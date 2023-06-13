package pac;

public class VehicleService {

	public static void main(String[] args) {
		
		  Vehicle[] vehicles = new Vehicle[]{  
	                new Car("Black", 2010),  
	                new Van(5000, 6),  
	                new Motorbike(100, "TVS")  
	        };
		  
		  int totalCost = calculateTotalCharge(vehicles);
		  
		  System.out.println("Total Service All vehicles: " + totalCost);
	}
	
	
	public static int calculateTotalCharge(Vehicle[] vehicles) {
		
		VehicleInspector vInspect = new VehicleInspection();
		
		int total =0;
		
		for (Vehicle vehicle : vehicles) {
			total = total+ vehicle.accept(vInspect);
		}
		
		return total;
		
	}

}
