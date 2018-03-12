package mario;
//program to simulate 1000 dicerolls and print their result in a table format
import java.util.Random; //random package
public class arrayrandomdice {
	public static void main(String[] args) {
		
		Random randomize = new Random();				//creating random object using random package
		int freq[] = new int[7];						// use 7 to use 0-7 in array
		
		for(int roll = 1; roll< 1000; roll++) {
			++freq[1+randomize.nextInt(6)];				// random generator to roll 0-5 but we moved it over with 1+ to go 1-6
		}
		System.out.println("Face\tFrequency");
		
		for(int face = 1; face<freq.length;face++) {	//for loop to show rolls
			System.out.println(face+"\t"+freq[face]);
		}
		
	}
}
