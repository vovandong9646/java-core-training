package project05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArray {
	
	public static void main(String[] args) {
		
		String x[] = {"H","E","L","L","O"};
		String y[] = {"W","O","R","L","D"};
		
		// b1. chuyển sang dạng list
		// b2. chuyển qua lại array
		// b3. in ra màn hình
		
		List list = new ArrayList<>();
		list.addAll(Arrays.asList(x));
		list.addAll(Arrays.asList(y));
		System.out.println(list);
		
		Object[] z = list.toArray();
		System.out.println(Arrays.toString(z));
		
		
	}
	
}
