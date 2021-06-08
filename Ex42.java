package Helloworld;

public class Ex42 {

	public static void main(String[] args) {
		int score =80;
		boolean isHandsome= true;
		if (isHandsome==true) {
			System.out.println("Good");
		}
		else {
			if (score>=80)
				System.out.println("Good");
			else if (score>=50 &&score<80)
				System.out.println("Normal");
			else
				System.out.println("fail");
		}
	}
}
