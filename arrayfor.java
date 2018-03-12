package mario;

public class arrayfor {
	public static void main(String[] args) {
		int array1[] = {4,5,6,7,8};
		int total = 0;
		
		for(int elem: array1) {
			total = total + elem;
		}
		System.out.println(total);
	}
}
