package project05;

public class TriAnularPattern2 {
	
	
//	   *
//	  **
//	 ***
//	****
	
	// vt=1; vẽ 3 dấu cách và 1 dấu *
	// vt=2; vẽ 2 dấu cách và 2 dấu *	
	// vt=3; vẽ 1 dấu cách và 3 dấu *
	// -> vì dấu cách vẽ trước dấu * nên i sẽ ngược
	
	public static void main(String[] args) {
		
		for(int i=4;i>0;i--) {
			
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			
			// dấu * đầu tiên bắt đầu từ vị trí cuối cùng của i
			for(int k=4;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
}
