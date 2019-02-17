package project05;

public class MaximumNums {
	
	public static void MaximumNums(int[] nums) {
		int max1 = 0;
		int max2 = 0;
		for(int x: nums) {
			if(max1 < x) {
				max2 = max1;
				max1 = x;
			} else if(max2 < x) {
				max2 = x;
			}
		}
		// ý đồ :
		// + sẽ lặp tất cả phần tử có trong mảng
		// + nếu phần tử đó lớn hơn giá trị max ban đầu thứ 1 thì
		//   + gán giá trị max trước đó cho thằng max thứ 2
		//   + sau đó gán phần tử đó vào max của thằng 1
		// + nếu phần tử x mà nhỏ hơn max1 nhưng lớn hơn max 2 thì gán vào max 2
		System.out.println("The first Maximum number is : " + max1);
		System.out.println("The second Maximum number is : " + max2);
	}
	
	public static void main(String[] args) {
		int num2[] = {43, 79, 8, 9, 500, 432, 678, 12, 7, 3, 560};
		MaximumNums(num2);
	}
	
}
