package activities;

public class Activity3 {
	
		
		double SECONDS = 1000000000;
		double EARTHSECONDS = 31557600;
		double MERCURYSECONDS = 0.2408467;
		double MARSSECONDS = 1.8808158;
		double VENUSSECONDS = 0.61519726;
		double JUPITERSECONDS = 11.862615;
		double SATURNSECONDS = 29.447498;
		double URANUSSECONDS = 84.016846;
		double NEPTUNESECONDS = 164.79132;
		
		public void calculateAge() {
			
			System.out.println("Earth: " + SECONDS/EARTHSECONDS + " earth years old.");
			System.out.println("Mercury: " + SECONDS/EARTHSECONDS/MERCURYSECONDS + " earth years old.");
			System.out.println("Mars: " + SECONDS/EARTHSECONDS/MARSSECONDS + " earth years old.");
			
		}
		
	
	public static void main(String[] args) {
	
		
		Activity3 age = new Activity3();
		age.calculateAge();

	}

}
