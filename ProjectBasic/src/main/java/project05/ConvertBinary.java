package project05;

public class ConvertBinary {

	public void convert(int number) {
		
		int binary[] = new int[40];
		int index = 0;
		
		while(number > 0) {
			binary[index++] = number % 2;
			number = number / 2;
		}
		for(int x=index-1; x>=0;x--) {
			System.out.print(binary[x]);
		}
	}
	
	public static void main(String[] args) {
		
		ConvertBinary cv = new ConvertBinary();
		cv.convert(10);
		
	}
	
	
}
