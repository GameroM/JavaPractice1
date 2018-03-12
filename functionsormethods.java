package mario;

public class functionsormethods {
	public static void main(String[] args) {
		sayHelloWorld();
		
		sayHelloTo("mario");
		
		int x = returnFive();
		System.out.println(x);
		
		System.out.println(squareNumber(3));
	}
	static int squareNumber(int x) {
		int result = x*x;
		return result;
		
	}
	static int returnFive() {
		return 5;
	}
	static void sayHelloTo(String name) {
		System.out.println("Hello, "+name);
	}
	static void sayHelloWorld() {
		System.out.println("Hello world");
	}

}
