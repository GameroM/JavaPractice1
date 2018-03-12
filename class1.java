package mario;

import java.util.Scanner;

public class class1 {
	public static void main(String[] args) {
		Scanner userin= new Scanner(System.in);
		
		//class2 object1 = new class2(); // creating an object,objectname can be anything
										//is in format; 'classname objectname = new classname();
		//object1.simpleMessage(); // name of the method
		
		
		//class2 object2 = new class2(); //more than one method can be run from the same class
		//object2.sMessage();
		
		class2 object3 = new class2();
		System.out.println("Enter your name here: ");
		String name=userin.nextLine();
		object3.simpleMessage2(name);
		
		
	}

}
