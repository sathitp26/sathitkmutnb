package Helloworld;

public class Ex5 {

	public static void main(String[] args) {
		int a= 11, b = 10;
		int ans= f1(a,b);
		System.out.println("ans=="+ans);
		f2(a,b);
		

	}
	public static int f1(int a, int b) {
		return a+b;
	}
	public static void f2(int a, int b) {
		System.out.println("a+b="+(a+b));
	}

}
