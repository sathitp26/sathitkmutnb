package Helloworld;

public class Ex2 {

	public static void main(String[] args) {
		bark();
		float newFloat = 5.5f;
		int newInt = (int) newFloat; 
		System.out.println("newFloat value: "+ newFloat);
		System.out.println("newInt value: "+ newInt); 
		
		int myInt = 5;
		float myFloat = myInt; 
		System.out.println("myInt value: "+ myInt);
		System.out.println("myFloat value: "+ myFloat);
		
		
		double d = 130.0; 
		float f = (float) d; 
		System.out.println("double value: "+ d); 
		System.out.println("float value: "+ f);
		
		char c = 'A'; 
		int d2 = (int) c; 
		System.out.println("char value: "+ c); 
		System.out.println("int value: "+ d2);
		
		final String hello= "Hello";
		//hello="New Hello";
		
	}
	public static void bark() {
		String dogName="Pluto";
		System.out.println("The Dog name= "+dogName+" bark");
	}
}
