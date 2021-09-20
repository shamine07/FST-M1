package activities;

public class Activity12 {

	public static void main(String[] args) {
		Addable a1 = (a, b) -> ( a + b );
		Addable a2 = (int a, int b) -> {
			return (a+b);
		};
		
		System.out.println("Addable a1: " + a1.add(2, 2));
		System.out.println("Addable a2: " + a2.add(5, 5));

	}

}
