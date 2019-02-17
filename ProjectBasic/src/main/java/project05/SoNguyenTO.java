package project05;

public class SoNguyenTO {
	public static void main(String[] args) {
		
		int x = 33;
		
		for(int i=1;i<=x;i++) {
			int count = 0;
			
			for(int j=i;j>=1;j--) {
				
				if(i%j == 0) {
					count++;
				}
				
			}
			if(count==2) {
				System.out.println("Số nguyên tố : " + i);
			}
			
			
		}
		
		
	}
}
