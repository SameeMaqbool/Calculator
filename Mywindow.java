package sam;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextPane;

public class Mywindow extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JButton btnNewButton_0;
	private JButton btnNewButton_point;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_6;
	private JButton btnNewButton_5;
	private JButton btnNewButton_4;
	private JButton btnNewButton_9;
	private JButton btnNewButton_8;
	private JButton btnNewButton_7;
	private JButton btnNewButton_Equals;
	private JButton btnNewButton_Subtraction;
	private JButton btnNewButton_Multiply;
	private JButton btnNewButton_Division;
	private JButton btnNewButton_Delete;
	private double n1;
	private double n2;
	private double r;
	private String calculation;
	private String answer;
	private JButton btnNewButton_Negative;
	private JButton btnNewButton_AC;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mywindow frame = new Mywindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Mywindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 384, 483);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(221, 160, 221));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton_Addition = new JButton("+");
		btnNewButton_Addition.setBackground(Color.MAGENTA);
		btnNewButton_Addition.setForeground(new Color(139, 0, 139));
		btnNewButton_Addition.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 25));
		btnNewButton_Addition.setBounds(278, 348, 82, 36);
		btnNewButton_Addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField_1.getText();
				n1 = Double.parseDouble(s1);
				textField_1.setText(null);
				calculation = "+";
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton_Addition);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(248, 222, 247));
		textField_1.setForeground(new Color(128, 0, 128));
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setBounds(10, 98, 350, 67);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		btnNewButton_0 = new JButton("0");
		btnNewButton_0.setBackground(new Color(248, 222, 247));
		btnNewButton_0.setForeground(new Color(139, 0, 139));
		btnNewButton_0.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 25));
		btnNewButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField_1.getText()+btnNewButton_0.getText();
				textField_1.setText(s1);
			}
		});
		btnNewButton_0.setBounds(96, 400, 82, 36);
		contentPane.add(btnNewButton_0);
		
		btnNewButton_point = new JButton(".");
		btnNewButton_point.setForeground(new Color(139, 0, 139));
		btnNewButton_point.setBackground(new Color(248, 222, 247));
		btnNewButton_point.setFont(new Font("Franklin Gothic Medium Cond", Font.BOLD, 26));
		btnNewButton_point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
			String s1 = textField_1.getText()+btnNewButton_point.getText();
			textField_1.setText(s1);
			}
		});
		btnNewButton_point.setBounds(186, 400, 82, 36);
		contentPane.add(btnNewButton_point);
		
		btnNewButton_1 = new JButton("1");
		btnNewButton_1.setBackground(new Color(248, 222, 247));
		btnNewButton_1.setForeground(new Color(139, 0, 139));
		btnNewButton_1.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 25));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField_1.getText()+btnNewButton_1.getText();
				textField_1.setText(s1);
			}
		});
		btnNewButton_1.setBounds(10, 346, 82, 36);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("2");
		btnNewButton_2.setBackground(new Color(248, 222, 247));
		btnNewButton_2.setForeground(new Color(139, 0, 139));
		btnNewButton_2.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 25));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField_1.getText()+btnNewButton_2.getText();
				textField_1.setText(s1);
			}
		});
		btnNewButton_2.setBounds(96, 346, 82, 36);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("3");
		btnNewButton_3.setBackground(new Color(248, 222, 247));
		btnNewButton_3.setForeground(new Color(139, 0, 139));
		btnNewButton_3.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 25));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField_1.getText()+btnNewButton_3.getText();
				textField_1.setText(s1);
			}
		});
		btnNewButton_3.setBounds(186, 346, 82, 36);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_6 = new JButton("6");
		btnNewButton_6.setBackground(new Color(248, 222, 247));
		btnNewButton_6.setForeground(new Color(139, 0, 139));
		btnNewButton_6.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 25));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField_1.getText()+btnNewButton_6.getText();
				textField_1.setText(s1);
			}
		});
		btnNewButton_6.setBounds(186, 297, 82, 36);
		contentPane.add(btnNewButton_6);
		
		btnNewButton_5 = new JButton("5");
		btnNewButton_5.setBackground(new Color(248, 222, 247));
		btnNewButton_5.setForeground(new Color(139, 0, 139));
		btnNewButton_5.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 25));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField_1.getText()+btnNewButton_5.getText();
				textField_1.setText(s1);
			}
		});
		btnNewButton_5.setBounds(96, 297, 82, 36);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_4 = new JButton("4");
		btnNewButton_4.setBackground(new Color(248, 222, 247));
		btnNewButton_4.setForeground(new Color(139, 0, 139));
		btnNewButton_4.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 25));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField_1.getText()+btnNewButton_4.getText();
				textField_1.setText(s1);
			}
		});
		btnNewButton_4.setBounds(10, 297, 82, 36);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_9 = new JButton("9");
		btnNewButton_9.setBackground(new Color(248, 222, 247));
		btnNewButton_9.setForeground(new Color(139, 0, 139));
		btnNewButton_9.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 25));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField_1.getText()+btnNewButton_9.getText();
				textField_1.setText(s1);
			}
		});
		btnNewButton_9.setBounds(186, 242, 82, 36);
		contentPane.add(btnNewButton_9);
		
		btnNewButton_8 = new JButton("8");
		btnNewButton_8.setBackground(new Color(248, 222, 247));
		btnNewButton_8.setForeground(new Color(139, 0, 139));
		btnNewButton_8.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 25));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField_1.getText()+btnNewButton_8.getText();
				textField_1.setText(s1);
			}
		});
		btnNewButton_8.setBounds(96, 242, 82, 36);
		contentPane.add(btnNewButton_8);
		
		btnNewButton_7 = new JButton("7");
		btnNewButton_7.setBackground(new Color(248, 222, 247));
		btnNewButton_7.setForeground(new Color(139, 0, 139));
		btnNewButton_7.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 25));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField_1.getText()+btnNewButton_7.getText();
				textField_1.setText(s1);
			}
		});
		btnNewButton_7.setBounds(10, 242, 82, 36);
		contentPane.add(btnNewButton_7);
		
		btnNewButton_Equals = new JButton("=");
		btnNewButton_Equals.setBackground(Color.PINK);
		btnNewButton_Equals.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 30));
		btnNewButton_Equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			n2 = Double.parseDouble(textField_1.getText());
			if (calculation == "+") {
				r = n1+n2;
			}
			else if (calculation == "-") {
				r = n1-n2;
			}
			else if (calculation == "*") {
				r = n1*n2;
			}
			else if (calculation == "/") {
				r = n1/n2;
			}
			answer = Double.toString(r);
			textField_1.setText(answer);
		}
		});
		btnNewButton_Equals.setBounds(278, 398, 82, 36);
		contentPane.add(btnNewButton_Equals);
		
		btnNewButton_Subtraction = new JButton("-");
		btnNewButton_Subtraction.setBackground(Color.MAGENTA);
		btnNewButton_Subtraction.setForeground(new Color(139, 0, 139));
		btnNewButton_Subtraction.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 30));
		btnNewButton_Subtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String s1 = textField_1.getText();
			textField_1.setText(null);
			n1 = Double.parseDouble(s1);
			calculation = "-";
			}
		});
		btnNewButton_Subtraction.setBounds(278, 302, 82, 36);
		contentPane.add(btnNewButton_Subtraction);
		
		btnNewButton_Multiply = new JButton("x");
		btnNewButton_Multiply.setBackground(Color.MAGENTA);
		btnNewButton_Multiply.setForeground(new Color(139, 0, 139));
		btnNewButton_Multiply.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 25));
		btnNewButton_Multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField_1.getText();
				n1 = Double.parseDouble(s1);
				textField_1.setText(null);
				calculation = "*";
			}
		});
		btnNewButton_Multiply.setBounds(278, 242, 82, 36);
		contentPane.add(btnNewButton_Multiply);
		
		btnNewButton_Division = new JButton("÷");
		btnNewButton_Division.setBackground(Color.MAGENTA);
		btnNewButton_Division.setForeground(new Color(139, 0, 139));
		btnNewButton_Division.setFont(new Font("Franklin Gothic Demi", Font.BOLD, 30));
		btnNewButton_Division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField_1.getText();
				n1 = Double.parseDouble(s1);
				textField_1.setText(null);
				calculation = "/";
			}
		});
		btnNewButton_Division.setBounds(278, 193, 82, 36);
		contentPane.add(btnNewButton_Division);
		
		JButton btnNewButton_C = new JButton("C");
		btnNewButton_C.setForeground(new Color(139, 0, 139));
		btnNewButton_C.setBackground(Color.MAGENTA);
		btnNewButton_C.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 25));
		btnNewButton_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(null);
			}
		});
		btnNewButton_C.setBounds(100, 193, 82, 36);
		contentPane.add(btnNewButton_C);
		
		btnNewButton_Delete = new JButton("DEL");
		btnNewButton_Delete.setBackground(Color.MAGENTA);
		btnNewButton_Delete.setForeground(new Color(139, 0, 139));
		btnNewButton_Delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Del = null;
				if (textField_1.getText().length()>0) {
					StringBuilder s = new StringBuilder(textField_1.getText());
					s.deleteCharAt(textField_1.getText().length()-1);
					Del = s.toString();
					textField_1.setText(Del);
				}
			}
			});
		btnNewButton_Delete.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 25));
		btnNewButton_Delete.setBounds(186, 194, 82, 36);
		contentPane.add(btnNewButton_Delete);
		
		
		JLabel lblNameofCalc = new JLabel("<html> Samee Maqbool's <br> Wonderfully Simple Calculator!");
		lblNameofCalc.setBackground(new Color(255, 0, 255));
		lblNameofCalc.setForeground(new Color(138, 43, 226));
		lblNameofCalc.setHorizontalAlignment(SwingConstants.LEFT);
		lblNameofCalc.setFont(new Font("Ravie", Font.BOLD, 20));
		lblNameofCalc.setBounds(10, 0, 331, 91);
		contentPane.add(lblNameofCalc);
		
		btnNewButton_Negative = new JButton("±");
		btnNewButton_Negative.setForeground(new Color(139, 0, 139));
		btnNewButton_Negative.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField_1.getText();
				if (s1.contains("-")) {
					textField_1.setText(s1.replace("-", ""));
					}else {
					s1 = "-"+ textField_1.getText();
					textField_1.setText(s1);
				}
			}
		});
		btnNewButton_Negative.setFont(new Font("Franklin Gothic Medium Cond", Font.BOLD, 26));
		btnNewButton_Negative.setBackground(new Color(248, 222, 247));
		btnNewButton_Negative.setBounds(10, 400, 82, 36);
		contentPane.add(btnNewButton_Negative);
		
		btnNewButton_AC = new JButton("AC");
		btnNewButton_AC.setForeground(new Color(139, 0, 139));
		btnNewButton_AC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(null);
				n1 = 0;
			}
		});
		btnNewButton_AC.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 25));
		btnNewButton_AC.setBackground(Color.MAGENTA);
		btnNewButton_AC.setBounds(10, 193, 82, 36);
		contentPane.add(btnNewButton_AC);
	}
}