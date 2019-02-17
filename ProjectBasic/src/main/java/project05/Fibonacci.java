package project05;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		// 0 1 1 2 3 5 8 ...
		int x = 0;
		int y = 1;
		int result = 0;
		System.out.print(x + " " + y);
		for(int i=1;i<20;i++) {
			result = x + y;
			System.out.print(" "+result);
			// gán lại giá trị đầu và cuối cho x, y
			x = y;
			y = result;
		}
	}
	
}
