
public class Fib {
	
	
	public int fibonacci(int n) {
		//base cases 
		if (n == 0) return 0;
		if (n == 1) return 1;
		
		//recursive step
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
