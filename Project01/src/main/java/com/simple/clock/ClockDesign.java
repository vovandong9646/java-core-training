package com.simple.clock;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.Color;

public class ClockDesign {

	private JFrame frame;
	private JLabel lblClock;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClockDesign window = new ClockDesign();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void dateTime() {
		Thread dateTime = new Thread() {
			public void run() {
				try {
					while(true) {
//						Calendar cal = Calendar.getInstance();
						Calendar cal = new GregorianCalendar();
						int day = cal.get(Calendar.DAY_OF_MONTH);
						int month = cal.get(Calendar.MONTH) +1;
						int year = cal.get(Calendar.YEAR);
						int hour = cal.get(Calendar.HOUR);
						int minute = cal.get(Calendar.MINUTE);
						int second = cal.get(Calendar.SECOND);
						lblClock.setText(day+"/"+month+"/"+year+" --- "+hour+":"+minute+":"+second);
						sleep(1000);
					}
				}catch(Exception e) {
					e.getMessage();
				}
			}
		};
		dateTime.start();
	}

	/**
	 * Create the application.
	 */
	public ClockDesign() {
		initialize();
		dateTime();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblClock = new JLabel("Clock");
		lblClock.setBackground(new Color(51, 204, 255));
		lblClock.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblClock.setBounds(24, 75, 368, 81);
		frame.getContentPane().add(lblClock);
	}

}
