package project01;

import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) {
		
		PrintWriter pw = new PrintWriter(System.out, true);
		String str = "World!!!";
		pw.println("Hello " + str);
	}
}
