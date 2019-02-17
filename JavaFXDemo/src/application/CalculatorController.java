package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalculatorController {

	@FXML
	private Label txtOutput;
	private boolean start = true;
	private String operator = "";
	private long number1 = 0;
	private Model model = new Model();
	
	// b1: sẽ định nghĩa 2 cái action trong UI
	// ta đã gán cho các số ứng với hàm numbers và các toán tử ứng với hàm operator
	// nên khi ta click vào số thì nó gọi hàm number , click vào toán tử thì nó gọi hàm operator
	// khi click vào các số thì sẽ gọi hàm này
	@FXML
	public void numbers(ActionEvent event) {
		// khi tính toán xong hoặc mới vào ứng dụng thì nó sẽ reset lại cái output là rỗng
		if(start) {
			txtOutput.setText("");
			start = false;
		}
		// còn lại thì nó get value và show các số lên màn hình(chỉ là "số" nhé không có toán tử)
		String value = ((Button)event.getSource()).getText();
		txtOutput.setText(txtOutput.getText() + value);
	}
	
	// khi click vào toán tử + - x / = thì sẽ gọi hàm này
	@FXML
	public void operator(ActionEvent event) {
		// lấy được cái toán tử + - x / mà người dùng click
		String value = ((Button)event.getSource()).getText();
		// nếu người dùng không bấm =
		if(!value.equals("=")) {
			// check xem có toán tử chưa, nếu như có rồi thì dừng xử lý
			// tại vì ta bấm x rồi sau đó bấm - nữa thì dừng xử lý (chỉ lấy cái x trước đó)
			if(!operator.isEmpty()) {
				return;
			}
			// nếu gán trực tiếp value thì sẽ x - thì sẽ lấy trừ
			operator = value;
			// set lại cái trị trước đó
			number1 = Long.parseLong(txtOutput.getText());
			// reset lại màn hình để nhâp số tiếp theo
			txtOutput.setText("");
		} else {
			if(operator.isEmpty()) return;
			Long number2 = Long.parseLong(txtOutput.getText());
			float result = model.calculator(number1, number2, operator);
			txtOutput.setText(String.valueOf(result));
			operator = "";
			start = true;
		}
	}

}
