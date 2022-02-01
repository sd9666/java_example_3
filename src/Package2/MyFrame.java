package Package2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
	
public class MyFrame extends JFrame implements ActionListener{
	JButton button = new JButton();
	JLabel label = new JLabel();

	MyFrame(){
	
		
		ImageIcon icon = new ImageIcon("C:/Users/User/Desktop/j.jpg.png");
		ImageIcon icon2 = new ImageIcon("C:/Users/User/Desktop/milana-jovanov.jpg");
		label.setIcon(icon2);
		label.setVisible(false);
		label.setBounds(0,0,150,150);
		button.setBounds(100,100,150,50);
		button.setText("Pritisni ovo dugme");
		button.setIcon(icon);
		button.setFocusable(false);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.TOP);
		button.setFont(new Font("Comic Sans",Font.BOLD,25));
		button.setIconTextGap(-33);
		button.setForeground(Color.orange);
		button.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(e -> System.out.println("piši briši"));
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			label.setVisible(true);
			
		}
	}

	
}
 	