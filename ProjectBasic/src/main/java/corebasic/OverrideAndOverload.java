package corebasic;

public class OverrideAndOverload {

	public int sum(int a, int b) { // overload
		return a + b;
	}
	
	public int sum(int a, int b, int c) { // overload
		return a + b + c;
	}
	
	// overload: trong class có các phương thức có tên giống nhau nhưng đối số truyền vào khác nhau
					// khác nhau về kiễu dữ liệu hay số lượng các tham số
					// không quan tâm kiểu trả về
	// override: phương thức trong class con ghi đè lại phương thức từ lớp cha
}

class SubClass extends OverrideAndOverload {
	
	@Override
	public int sum(int a, int b) { // override từ class cha
		// TODO Auto-generated method stub
		return super.sum(a, b);
	}
	
	@Override
	public int sum(int a, int b, int c) { // override từ class cha
		// TODO Auto-generated method stub
		return super.sum(a, b, c);
	}
}


