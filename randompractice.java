package mario;

import java.util.Random;

public class randompractice {
	public static void main(String[] args) {
		Random result = new Random();
		int number;
		
		for(int counter = 1;counter<=10;counter++) {
			number = 1+result.nextInt(6);
			System.out.println("The roll is " + number);
		}
			
	}
}
