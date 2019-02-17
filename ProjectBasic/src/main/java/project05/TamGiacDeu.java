package project05;

public class TamGiacDeu {
	public static void main(String[] args) {
		
		for(int i=0;i<15;i++) {
			System.out.format("%"+(15-i)*2+"s", "");
			int num1 = 1;
			for(int j=0;j<i;j++) {
				System.out.format("%4d", num1);
				num1 = num1 *(i-j)/(j+1);
			}
			
			System.out.println();
			
		}
		
		
	}
}
