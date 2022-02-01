import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		double x;
		double y;
		 Scanner scanner = new Scanner (System.in);
		 System.out.println("Input x");
		 x = scanner.nextDouble();
		 System.out.println("Input y");
		 y = scanner.nextDouble();
		 double z = Math.sqrt((x*x)+(y*y));
		System.out.println("hipitenuse"+z);
		
		
		
		/*
		 * 
		 * 
		 * double a = 4.5;
		double b = 2.3;
		double g = -12.7;
		
		
		double z = Math.max(a, b);
		double t = Math.min(a,b);
		double s = Math.abs(g);
		double h = Math.sqrt(g);
		double i = Math.round(g);
		double j = Math.ceil(g);
		double k = Math.floor(g);
		System.out.println(z);
		System.out.println(t);
		System.out.println(s);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
		String x ="water";
		String y = "boja";
		String temp;
	
		temp = x;
		x=y;
		y=temp;
		String name = JOptionPane.showInputDialog("What is your name");
		JOptionPane.showMessageDialog(null,"Hello "+name);
		int agee = Integer.parseInt(JOptionPane.showInputDialog("How old are you"));
		JOptionPane.showMessageDialog(null, "Ages "+agee);
		double height = Double.parseDouble(JOptionPane.showInputDialog("cm "));
		JOptionPane.showMessageDialog(null, height);
		
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		
		Scanner myobject = new Scanner(System.in);
		System.out.println("What is your name");
		String username = myobject.nextLine();
		System.out.println("How old are you");
		int age = myobject.nextInt();
		myobject.nextLine();
		System.out.println("What is your favourite food");
		String food = myobject.nextLine();
		
		
		System.out.println("Your name is "+username);
		System.out.println("You are "+age);
		System.out.println("Your favourite food is "+food);
		
*/		 	
	
}
}