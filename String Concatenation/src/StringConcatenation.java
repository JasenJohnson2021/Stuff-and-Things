
public class StringConcatenation {
	public static void main(String[] args) {
		String beginning = "Hello ";
		
		String end = "World";
		String combo = beginning + end;
		
		System.out.println(combo);
		
		//adding a primitive to a string
		long l = 203L;
		System.out.println("The value of l: " + l);
		
		//adding a primitive to beginning of string
		boolean b = true;
		System.out.println(b + " is true");
		
		//order matters
		int x = 2;
		int y = 3;
		System.out.println("The sum ox and y is " + x + " " + y);
		
		System.out.println(x + y +  " is the sum of x and y");
	}

}
