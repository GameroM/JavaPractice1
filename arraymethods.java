package mario;

public class arraymethods {
	public static void main(String[] args) {
		int array1[] = {4,5,6,7,8};				//create array
		change(array1);							//calling method (function in python)
		
		for(int elem:array1) {					//for elements in array do command
			System.out.println(elem);
		}
			
		
	}
	public static void change(int x[]) {		// new method, (function in python)
		for(int counter = 0; counter<x.length;counter++) {  // do number of times in this case as many as length of array
			x[counter]+=5;						//add 5 to the numbers in the array
		}
	}

}
