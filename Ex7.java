package Helloworld;

public class Ex7 {

	public static void main(String[] args) {
		String string1 = "You and Me" , string2 = " you and me ";
		System.out.println("Equals= "+ string1.equals(string2));
		System.out.println("You Contain= "+ string1.contains("You"));
		System.out.println("Length of string1 = "+ string1.length());
		System.out.println("Length of string2 = "+ string2.length());
		System.out.println(string1.substring(1, 4));
		System.out.println("String2's length before trim=  "+string2.length());
		System.out.println("String2's length after trim=  "+string2.trim().length());
		System.out.println("Uppercase of string1 = "+ string1.toUpperCase());
		System.out.println("Uppercase of string2 = "+ string2.toUpperCase());
		System.out.println("Uppercase of string2 = "+string2.toUpperCase().trim());

	}

}
