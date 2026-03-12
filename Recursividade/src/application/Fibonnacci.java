package application;

public class Fibonnacci {

	public static void main(String[] args) {
		
		System.out.println(fib(5));

	}
	
	public static int fib(int n) {
		
		if (n==1 || n==2) {
			return n-1;
		}
		else {
			return fib(n-2) + fib(n-1);
		}
	}

}
