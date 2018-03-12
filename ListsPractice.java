// JAVA LISTS the same as python

package mario;

import java.util.*;

public class ListsPractice {
	public static void main(String[] args) {
		
		Scanner userin = new Scanner(System.in);
		
		System.out.println("Enter length of desired list: ");
		int lenlist = userin.nextInt();
		
		
		ArrayList list1 = new ArrayList();
		
		
		for(int counter = 0; counter < lenlist; counter++) {
			System.out.println("Enter an element: ");
			String value=userin.next();
			list1.add(value);
		}
		System.out.println("the result is: "+list1);
		Collections.reverse(list1);						//how to reverse list
		System.out.println("the result is: "+list1);
		
		
	}
}
