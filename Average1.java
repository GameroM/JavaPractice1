package mario;

import java.util.Scanner;

public class Average1 {
	public static void main(String[] args) {
		
		Scanner userin = new Scanner(System.in);
		int total = 0;
		int counter = 0;
		int grade;
		int average;
		
		while(counter < 10) {
			System.out.println("Enter grade: ");
			grade = userin.nextInt();
			total = grade+ total;
			counter++;
		
		}
		average = total / 10;
		System.out.println("The average of the 10 grades is: "+average);
	}

}
