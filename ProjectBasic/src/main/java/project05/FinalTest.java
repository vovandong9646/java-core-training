package project05;

class Person{
	final void display() {
		System.out.println("Đây là 1 con người việt nam chất phác, thật thà, kiên cường, dũng cảm");
	}
}

public class FinalTest extends Person {
	
	// theo lý thuyết thì :
	// biến mà có final thì sẽ không thể gán giá trị biến đó 2 lần được
	// phương thức mà có final thì không thể override được
	// class có final thì không thể kế thừa được
//	@Override
//	public void display() {
//		super.display();
//	}
	
	public static void main(String[] args) {
		FinalTest ft = new FinalTest();
		ft.display();
		
	}
	
}
