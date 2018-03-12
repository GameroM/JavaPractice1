package mario;

import java.util.Scanner;

public class Input_and_Print1 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter gf name: ");
		String gfname = userin.nextLine();
		System.out.println("Your gf name is: " + gfname);
	}

}
