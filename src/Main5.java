
public class Main5 {
	
	public static void main (String[] args) {
		
		Pizza pizza1 = new Pizza("thicc crust","tomato","mozzerella","pepperoni");
		Pizza pizza2 = new Pizza("thicc crust","tomato","mozzerella");
		Human human1 = new Human ("Haris", 21, "green");
		Human human2 = new Human ("Ahmed");
		
		System.out.println(human1.name +" is a customer");
		System.out.println("He ordered a pizza with next ingredinets: ");
		System.out.println(pizza1.bread);
		System.out.println(pizza1.cheese);
		System.out.println(pizza1.sauce);
		System.out.println(pizza1.topping);
		System.out.println(human2.name+" is a customer");
		System.out.println("He ordered a pizza with next ingredinets: ");
		System.out.println(pizza1.Ispisi());
		
		
		
		Food food1 = new Food("pizza");
		Food food2 = new Food("beans");
		Food food3 = new Food("meat");
		Food[] market= {food1,food2,food3};
		
		System.out.println(market[2].name);
		
		
		
		
		
		
		
		
		
		
		
		
	/*	Human human1 = new Human("Salko",21,"blue");
		Human human2 = new Human("Selim",24,"black");
		System.out.println(human1.name);
		System.out.println("My name is "+human2.name+". I am "+ human2.age+" years old");
		
		human2.eat();*/
	}
	
	
	
	
	
}
