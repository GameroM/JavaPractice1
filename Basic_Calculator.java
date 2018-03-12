package mario;
//addition only

import java.util.Scanner;

public class Basic_Calculator {
	public static void main(String args[]) {
		Scanner userin = new Scanner(System.in);	//same as 'userin = input()' in Python
		float fnum, snum, answer;
		System.out.println("Enter first number: ");
		fnum = userin.nextFloat();
		System.out.println("Enter second number: ");
		snum = userin.nextFloat();
		answer = fnum + snum;
		System.out.println(answer);
	}

}
