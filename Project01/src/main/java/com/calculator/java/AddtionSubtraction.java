package com.calculator.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddtionSubtraction {

	private JFrame frame;
	private JTextField txtA;
	private JTextField txtB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddtionSubtraction window = new AddtionSubtraction();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddtionSubtraction() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtA = new JTextField();
		txtA.setBounds(64, 38, 86, 20);
		frame.getContentPane().add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(282, 38, 86, 20);
		frame.getContentPane().add(txtB);
		
		JLabel lblA = new JLabel("A");
		lblA.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblA.setHorizontalAlignment(SwingConstants.RIGHT);
		lblA.setBounds(10, 41, 46, 14);
		frame.getContentPane().add(lblA);
		
		JLabel lblB = new JLabel("B");
		lblB.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblB.setHorizontalAlignment(SwingConstants.RIGHT);
		lblB.setBounds(228, 41, 46, 14);
		frame.getContentPane().add(lblB);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setBounds(120, 103, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("SUB");
		btnSub.setBounds(212, 103, 89, 23);
		frame.getContentPane().add(btnSub);
		
		final JLabel lblKetQua = new JLabel("");
		lblKetQua.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblKetQua.setBounds(209, 171, 113, 14);
		frame.getContentPane().add(lblKetQua);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResult.setBounds(148, 171, 86, 14);
		frame.getContentPane().add(lblResult);
		
		// event
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = txtA.getText();
				String b = txtB.getText();
				if("".equalsIgnoreCase(a) || a == null) {
					JOptionPane.showMessageDialog(null, "Vui lòng nhập A");
				} else if("".equalsIgnoreCase(b) || b == null) {
					JOptionPane.showMessageDialog(null, "Vui lòng nhập B");
				} else if(!a.matches("(-?)\\d") || !b.matches("(-?)\\d")) {
					JOptionPane.showMessageDialog(null, "Vui lòng nhập số");
				} else {
					lblKetQua.setText(Integer.parseInt(a) + Integer.parseInt(b) + "");
				}
			}
		});
		
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = txtA.getText();
				String b = txtB.getText();
				if("".equalsIgnoreCase(a) || a == null) {
					JOptionPane.showMessageDialog(null, "Vui lòng nhập A");
				} else if("".equalsIgnoreCase(b) || b == null) {
					JOptionPane.showMessageDialog(null, "Vui lòng nhập B");
				} else if(!a.matches("(-?)\\d") || !b.matches("(-?)\\d")) {
					JOptionPane.showMessageDialog(null, "Vui lòng nhập số");
				} else {
					lblKetQua.setText(Integer.parseInt(a) - Integer.parseInt(b) + "");
				}
			}
		});
	}

}
