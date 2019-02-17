package project02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintUserInput {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input A: ");
		int number1 = Integer.parseInt(br.readLine());
		System.out.println("input B: ");
		int number2 = Integer.parseInt(br.readLine());
		int result = number1 + number2;
		System.out.println("Ket qua cua "+number1+" + "+ number2 +" la: "+result);
	}
}
