package Package2;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Launch implements ActionListener{
	
		JFrame frame = new JFrame();
		JButton button = new JButton("New Windows");
		
		
		 Launch(){
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(420,420);
			frame.setVisible(true);
			frame.setLayout(null);
			
			button.setBounds(120,100,150,50);
			button.setFocusable(false);
			button.addActionListener(this);
			frame.add(button);
			
			//JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
			//JOptionPane.showMessageDialog(null, "This is more important information", "naslov",JOptionPane.INFORMATION_MESSAGE);
			//JOptionPane.showMessageDialog(null,"This is question for you","naslov",JOptionPane.QUESTION_MESSAGE);
			//JOptionPane.showMessageDialog(null,"This is question for you","naslov",JOptionPane.WARNING_MESSAGE);
			
			//JOptionPane.showMessageDialog(null,"This is question for you","naslov",JOptionPane.ERROR_MESSAGE);
		    //JOptionPane.showConfirmDialog(null,"Do you want pizza","jelo",JOptionPane.YES_NO_CANCEL_OPTION);
			
			//String name = JOptionPane.showInputDialog("What is your name");
			//System.out.println(name);
			
			
			String[] response = {"No,you are awesome","thank you","vozdra"};
			ImageIcon myicon = new ImageIcon("C:/Users/User/Desktop/x.png");
			
			JOptionPane.showOptionDialog(null,
					"You are awesome", 
					"naslov",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.INFORMATION_MESSAGE,
					myicon,
					response,
					0);
		}
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button) {
					NewWindow mywindow = new NewWindow();
					frame.dispose();
				}
				
			}
		

}
