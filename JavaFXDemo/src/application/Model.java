package application;

public class Model {

	public float calculator(long x, long y, String operator) {
		switch (operator) {
			case "+":
				return x + y;
			case "-":
				return x - y;
			case "X":
				return x * y;
			case "/":
				if(y == 0) return 0;
				return x / y;
			default:
				return 0;
		}
	}
}
