package project05;

public class ConvertStringToChar {

	public static void main(String[] args) {
		
		// input vào string
		// for từng ký tự trong string => char ("".toCharArray())
		String hello = "Hello World!!!";
		
		char[] arrayChar = hello.toCharArray();
		int index = 0;
		for (char c : arrayChar) {
			if(index != 0) {
				System.out.print(",");
			}
			System.out.print(c);
			index++;
		}
	}
	
}
