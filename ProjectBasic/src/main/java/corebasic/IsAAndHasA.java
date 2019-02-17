package corebasic;

public class IsAAndHasA {
	
	// Is A: class con kế thừa từ class cha
	// Has A: trong class có tham chiếu của 1 class khác
	
}

class Person {
	private Employee employee; // 1 person sẽ thuộc 1 employee -> gọi là has A
}

class Employee extends Person { // kế thừa lớp cha gọi là is A
	
}
