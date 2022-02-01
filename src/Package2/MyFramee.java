package Package2;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Color;


import java.awt.event.ActionEvent;

public class MyFramee extends JFrame implements ActionListener{
	
	JRadioButton button1;
	JRadioButton button2;
	JRadioButton button3;
	ButtonGroup group;
	JFrame frame;
	ImageIcon icon1;
	JComboBox comboBox;
	MyFramee() {
		 frame = new JFrame();
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.pack();
		 this.setVisible(true);
		 this.setLayout(new FlowLayout());
		 this.setSize(200,200);
		
		 String [] drinks = {"Soda","Cola","Pepsi"};
		 
		 
		 comboBox = new JComboBox(drinks);
		 comboBox.addActionListener(this);
		// comboBox.setEditable(true);
		// comboBox.addItem("water");
		 comboBox.insertItemAt("water",0);
		 comboBox.removeItem("water");
		 this.add(comboBox);
		 
		 
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==comboBox) {
			System.out.println(comboBox.getSelectedItem()); 
			
		}
	}
}
		
		/*
		JFrame frame = new JFrame();
		button1 = new JRadioButton("Pizza");
		button2 = new JRadioButton("Coca Cola");
		button3 = new JRadioButton("Pepsi");
		icon1 = new ImageIcon("C:/Users/User/Desktop/image832.png");
		
		
		group = new ButtonGroup();
		group.add(button1);
		group.add(button2);
		group.add(button3);
		button1.setIcon(icon1);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
		this.add(button1);
		this.add(button2);
		this.add(button3);
		
		
		
		
	}
	
	public void actionPerformed (ActionEvent e) {
		if(e.getSource()==button1) {
			System.out.println("You ordered pizza");
			
		}else if(e.getSource()==button2) {
			System.out.println("You ordered Coca Cola");
		}else {
			System.out.println("You ordered Pepsi");
		}
	}
}
	
	/*	frame = new JFrame();
		button = new JButton();
		button.setText("Submit");

		checkBox =new JCheckBox();
		this.add(checkBox);
		this.add(button);
		button.addActionListener(this);
		checkBox.setText("I'm not robot");
		this.setFocusable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println(checkBox.isSelected());
		}
	}
	}
	
	

	/*JButton button;
	JTextField myTextField;
	MyFramee(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		myTextField = new JTextField();
		myTextField.setPreferredSize(new Dimension(300,100));
		button = new JButton("Submit");
		button.setBounds(80,80,50,50);
		button.addActionListener(this);
		myTextField.setForeground(Color.red);
		myTextField.setBackground(Color.black);
		myTextField.setCaretColor(Color.white);
		myTextField.setText("username");
		
		
		
		
		this.pack();
		this.setSize(420,420);
		this.add(myTextField);
		this.add(button);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
		
			System.out.println("Welcome "+myTextField.getText()); 
		}
		*/
	