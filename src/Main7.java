import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.math.*;

public class Main7 {

		public static void main (String[] args) {
			ImageIcon image = new ImageIcon("C:/Users/User/Desktop/j.jpg.png");

			
			JLabel label = new JLabel();
			label.setText("Hello");
			label.setIcon(image);
			label.setText("hello 2");
			label.setVerticalAlignment(JLabel.BOTTOM);
			label.setHorizontalAlignment(JLabel.LEFT);
			label.setBounds(0,10,10,10);
	
			
			
			JPanel redpanel = new JPanel();
			JPanel bluepanel = new JPanel();
			JPanel greenpanel = new JPanel();

			greenpanel.setLayout(null);
			redpanel.setBounds(0,0,100,100);
			redpanel.setBackground(Color.red);
			bluepanel.setBounds(100,0,100,100);
			bluepanel.setBackground(Color.blue);
			greenpanel.setBackground(Color.green);
			greenpanel.setBounds(0,100,200,100);
			greenpanel.add(label);
			
		
			
			JFrame frame = new JFrame();
			frame.setSize(500, 500);
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			frame.setLayout(null);
			frame.add(redpanel);
			frame.add(bluepanel);
			frame.add(greenpanel);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		/*	JFrame frame = new JFrame();
			JLabel label = new JLabel();
			ImageIcon image = new ImageIcon("C:/Users/User/Desktop/milana-jovanov.jpg");
			
		
			frame.setVisible(true);
			//frame.setSize(250,250);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			label.setText("Bro");
			label.setIcon(image);
			label.setBackground(new Color(0,0,0));
			label.setOpaque(true);
			//label.setBounds(100,100,250,250);
			frame.add(label); 
			frame.pack();
			
			
			
			
			/*
			File file = new File("C:/Users/User/Desktop/new.txt");
			
			if(file.exists()) {
				System.out.println("Exists");
				System.out.println(file.getPath());
				System.out.println(file.getAbsolutePath());
				file.delete();
			}else {
				System.out.println("Doesn't exist");
			}

		/*	Scanner scanner = new Scanner (System.in); 
			
			try {
			
			System.out.println("Enter the first number");
			int a = scanner.nextInt();
			System.out.println("Enter the second number");
			int b = scanner.nextInt();
			double z = a/b;
			System.out.println(a +":"+b+"="+z);
			}
			catch(ArithmeticException e) {
				System.out.println("You can't divide by 0");
			}
			catch(InputMismatchException e) {
				System.out.println("You must input a number");
			}
			finally{
				scanner.close();
			}
		}}
			
			
			
			
			
			
			
			
		/*	Animal animal;
			Scanner scanner = new Scanner(System.in);
			System.out.println("What animal do you want?");
			System.out.println("1=dog or 2=cat");
			int a = scanner.nextInt();
			
			if(a == 1) {
				animal = new Dogg();
				animal.speak();
			}else if(a==2) {
				animal = new Cat();
				animal.speak();
			}else {
				System.out.println("Error");
				
			}
			
			
		}
		
		
}
			
		/*	Car1 car1 = new Car1();
			car1.go();
			
			
			
		/*	Person person = new Person("Selim",25);
			Hero hero = new Hero ("Haris",26, "Superman");
			
			hero.toString();
			System.out.println(hero.toString());
			
			
			
			
		/*	
			Dog dog = new Dog();
			Animals animal = new Animals();
			dog.speak();
			animal.speak();
			
			
			/*
			Carrr carrr = new Carrr("BMW");
			Bike bike = new Bike();
			carrr.start();
			bike.park();
			
			
			
			
			
		/*	Friend friend1 = new Friend("Mujo");
			Friend friend2= new Friend("Suljo");
			Friend friend3 = new Friend("Meho");
			
			System.out.println(Friend.numberOfFriends);*/
			

			
			
		}
}