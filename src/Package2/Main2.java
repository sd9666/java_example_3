package Package2;

import java.awt.Dimension;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class Main2 {
	public static void main (String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new GridLayout(3,3));
		
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		
		frame.setVisible(true);
		
		/*
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		
		frame.setLayout(new FlowLayout());
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(200,200));
		panel.setBackground(Color.cyan);
		panel.setLayout(new FlowLayout());
		frame.add(panel);
	
		
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		
		frame.setVisible(true);
		
		
		*/
	}
		
		/*
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		frame.setVisible(true);
		frame.setLayout(new BorderLayout(10,10));

		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.yellow);
		panel3.setBackground(Color.magenta);
		panel4.setBackground(Color.blue);
		panel5.setBackground(Color.cyan);
		
		
		//SUBMENU
		
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		
		panel6.setPreferredSize(new Dimension(50,50));
		panel7.setPreferredSize(new Dimension(50,50));
		panel8.setPreferredSize(new Dimension(50,50));
		panel9.setPreferredSize(new Dimension(50,50));
		panel10.setPreferredSize(new Dimension(50,50));
		
		
		panel6.setBackground(Color.green);
		panel7.setBackground(Color.black);
		panel8.setBackground(Color.pink);
		panel9.setBackground(Color.darkGray);
		panel10.setBackground(Color.white);
		
		//SUBMENU
		panel4.setLayout(new BorderLayout());
		
		
		
		
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.EAST);
		frame.add(panel3, BorderLayout.WEST);
		frame.add(panel4, BorderLayout.CENTER);
		frame.add(panel5, BorderLayout.SOUTH);
		
		panel4.add(panel6, BorderLayout.EAST);
		panel4.add(panel7, BorderLayout.NORTH);
		panel4.add(panel8, BorderLayout.WEST);
		panel4.add(panel9, BorderLayout.CENTER);
		panel4.add(panel10, BorderLayout.SOUTH);
		
		*/
	}
	


