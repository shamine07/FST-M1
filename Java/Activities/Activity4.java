package activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		
		int[] numbers = {4,3,5,1,2};
		
		for (int i=1; i<numbers.length; i++) {
			int temp = numbers[i];
			int j = i-1;
			
			while(j>=0 && temp<numbers[j]) {
				numbers[j+1] = numbers[j];
				j = j-1;
			}
			numbers[j+1] = temp;
		}
		
		System.out.println("Sorted array: ");
		System.out.println(Arrays.toString(numbers));

	}

}
