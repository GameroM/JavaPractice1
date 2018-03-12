package mario;

public class varlenarg {
	public static void main(String[] args) {
		System.out.println("The average of the numbers is: "+average(42,3245,634,234,123,43,2,3,1));
	}
	public static int average(int...numbers) {
		int total = 0;
		for(int x:numbers) 
			total += x;
		
		return total/numbers.length;
		
		//return total;
	}

}
