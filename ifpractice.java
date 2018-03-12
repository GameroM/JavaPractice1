package mario;

import java.util.Scanner;
public class ifpractice {
	public static void main(String args[]) {
		Scanner userin = new Scanner(System.in);
		int num;
		System.out.println("Enter your number: ");
		num = userin.nextInt();
		if(num == 9) {
			System.out.println("yes");
		}else {
			System.out.println("This is else");
		}
	}
	

}
