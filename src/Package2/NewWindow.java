package Package2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
public class NewWindow {
	JFrame frame = new JFrame();
	JLabel label= new JLabel("HELLO");
	JPanel panel = new JPanel();
	NewWindow(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(240,240);
		frame.setVisible(true);
		frame.setLayout(null);
		
		label.setBounds(0,0,100,100);
		panel.setBounds(0,0,100,100);
		panel.setBackground(Color.red);
		
		frame.add(label);
		frame.add(panel);
	}
	
	

}
