package mario;

public class arraysum {
	public static void main(String [] args) {
		int numbs[] = {21,16,86,21,3};
		int sum = 0;
		
		for(int counter = 0; counter<numbs.length;counter++) {
			sum= sum+numbs[counter];
		}
		System.out.println("The sum is: "+sum);
	}

}
