package project05;

public class AddDigits {
	public static void main(String[] args) {
		
		int number = 568;
		// 5, 6, 8 => 5 + 6 + 8 =19
		int add = 0;
		while(number != 0) {
			
			int sum = number % 10;
			add += sum;
			number /= 10;
			
		}
		System.out.println(add);
		
		// 568 % 10 -> 8 -> sum += 8 = 8 -> 568/10=56
		// 56 % 10 -> 6 -> sum+=6= 14 -> 56/10 = 5
		// 5 % 10 -> 5 -> sum+=5=19 -> 5/10 = 0 
		// 0=>khong thoa
		
	}
}
