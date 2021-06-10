package Helloworld;

public class Ex8 {

	public static void main(String[] args) {
		int[][] twoD_Array = {{1, 2, 3},{4, 5, 6, 7},{8, 9}};
		for(int[] row :twoD_Array) {
			for(int element:row) {
				System.out.println(element);
			}
		}
		int sum=0;
		
	   for(int i=0;i< twoD_Array.length;i++) {
		  sum+= twoD_Array[i][twoD_Array[i].length-1];   
	   }
	   System.out.println("Sum last element in each row = "+sum);
	}

}
