package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane{
	
	private int maxPassengers;
	private List<String> passengers;
	private Date lastTimeTookOff;
	private Date lastTimeLanded;
	
	public Plane(int maxPassengers){
		this.maxPassengers = maxPassengers;
		this.passengers = new ArrayList<>();
	}
	
	public void onboard(String passengers){
		this.passengers.add(passengers);		
	}
	
	public Date takeOff() {
		this.lastTimeTookOff = new Date();
		return lastTimeTookOff;
	}
	
	public void land() {
		this.lastTimeLanded = new Date();
		this.passengers.clear();
	}
	
	public Date lastTimeLanded() {
		return lastTimeLanded;
	}
	
	public List<String> getPassengers(){
		return passengers;
	}
	
}

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		
		Plane plane = new Plane(10);
		plane.onboard("Vijay");
		plane.onboard("Shilpa");
		System.out.println("The take off time is " + plane.takeOff());
		System.out.println("Passengers onboarded are " + plane.getPassengers());
		Thread.sleep(3000);
		plane.land();
		System.out.println("Plane landed at " + plane.lastTimeLanded());
		System.out.println("Passenger list after landing " + plane.getPassengers());

	}

}
