package activities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayOfNos = {10, 77, 10,54,-11,10};
		int sum = 0;
		
		for(int i=0; i<6; i++) {
			if (arrayOfNos[i] == 10) {
				sum = sum + arrayOfNos[i];
				System.out.println(sum);
			}
		}
		
		if (sum == 30) {
			System.out.println("true");
		}
		else
			System.out.println("false");

	}

}
