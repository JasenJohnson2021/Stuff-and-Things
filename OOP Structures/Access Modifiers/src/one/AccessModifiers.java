package one;
import two.ProtectedSubClass;

public class AccessModifiers {

	public static void main(String[] args) {
		//access class methods here
		Person adam = new Person();
		adam.age = 15;
		
		System.out.println(adam.age);
		
		//Person charlie = new Person();
		//charlie.age1 = 27;
		
		//System.out.println(charlie.age1);
		
		ProtectedSubClass psc = new ProtectedSubClass();
		psc.printID();

	}

}
