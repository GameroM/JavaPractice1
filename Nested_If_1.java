package mario;

import java.util.Scanner;

public class Nested_If_1 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = userin.nextInt();
		
		if(age < 50) {
			System.out.println("you arent over 50");
			
		}
		else {
			System.out.println("You are over 50");
			if(age > 75) {
				System.out.println("over 75");
				
			}
			else {
				System.out.println("under 75");
			}
		}
	}
}
