package string;

public class StringDemo {
	
	public static void main(String[] args) {
		
		
		
		
		StringDemo s = new StringDemo();
		long start = System.currentTimeMillis();
		System.out.println("Start: " + start);
		s.testPerformanceOfStringBuffer();
		System.out.println("End String: " + (System.currentTimeMillis() - start));
		
		long start1 = System.currentTimeMillis();
		System.out.println("Start: " + start1);
		s.testPerformanceOfStringBuilder();
		System.out.println("End StringBuider: " + (System.currentTimeMillis() - start1));
		
		long start2 = System.currentTimeMillis();
		System.out.println("Start: " + start2);
		s.testPerformanceOfStringBuffer();
		System.out.println("End StringBuffer: " + (System.currentTimeMillis() - start2));
		
	}
	
	public void testPerformanceOfString() {
		String s = "DongPro";
		for(int i=1;i<10000000;i++) {
			s += i;
		}
	}

	public void testPerformanceOfStringBuilder() {
		StringBuilder s = new StringBuilder("DongPro");
		for(int i=1;i<10000000;i++) {
			s.append(i);
		}
	}
	
	public void testPerformanceOfStringBuffer() {
		StringBuffer s = new StringBuffer("DongPro");
		for(int i=1;i<10000000;i++) {
			s.append(i);
		}
	}
	
	// StringBuilder khong dong bo -> nhanh hon
	// StringBuffer dong bo
	
}
