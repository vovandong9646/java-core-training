package project03;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateAndTime {
	public static void main(String[] args) {
		
		Thread thread = new Thread() {
			int day, month, year, hour, minute, second;
			String output = "";
			@Override
			public void run() {
				try {
					while(true) {
						// mỗi lần chạy thì gọi lại để get ra giờ
						GregorianCalendar cal = new GregorianCalendar();
						day = cal.get(Calendar.DAY_OF_MONTH);
						month = cal.get(Calendar.MONTH) + 1;
						year = cal.get(Calendar.YEAR);
						hour = cal.get(Calendar.HOUR);
						minute = cal.get(Calendar.MINUTE);
						second = cal.get(Calendar.SECOND);
						output = "Date: "+day +"/"+month+"/"+year+" -- Time: "+hour+":"+minute+":"+second;
						System.out.println(output);
						sleep(1000);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		thread.start();
	}
}
