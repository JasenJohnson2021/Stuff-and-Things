package Methods;

public class MethodOverloading {
	
	public static void main(String[] args) {
		//create instance here 
		MethodOverloading mo = new MethodOverloading();
		mo.print();
		
		mo.print("second print method");
		
		mo.print("second", "third");
	}
	
	//overload methods here
	public void print() {
		System.out.println("Original print method");
	}
	
	public void print(String str) {
		System.out.println(str);
	}
	
	public void print(String str, String str2) {
		System.out.println(str + " " + str2);
	}
	
	//public void print(String first, String second) {
		//System.out.println(first + " " + second);
	//}

}
