// helpful for filling in arrays with user input

package mario;

import java.util.Scanner;

public class ArrayInput {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("Enter number of elements: ");
		
		int nelem = userin.nextInt();
		int array1[] = new int[nelem];
		
		System.out.println("Enter elements: ");
		
		for(int counter = 0; counter<nelem;counter++) {
			array1[counter]=userin.nextInt();
		}
		
		for(int counter:array1) {
			System.out.println(counter);
		}
		
	}
}
