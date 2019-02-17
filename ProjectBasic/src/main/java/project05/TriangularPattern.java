package project05;

public class TriangularPattern {
	public static void main(String[] args) {
		
//		****
//		 ***
//		  **
//		   *
		int height = 7;
		for(int i=height;i>0;i--) {
			
			for(int j=height;j>i;j--) {
				System.out.print(" ");
			}
			
			for(int k=1;k<i;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		   
		   // i=4; ****
		   // i=3;  ***
		   // i=2;   **
		   // i=1;    *
		
		   
	}
}
