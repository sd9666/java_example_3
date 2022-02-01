package Package1;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car("Chevrolet","Camaro",1996);
		Car car2 = new Car("Škoda","Fabia",2020);
	
		System.out.println(car1.getMake());
		car1.copy(car2);
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car1.getMake());
		System.out.println(car1.getName());
		System.out.println(car1.getYear());
		
		System.out.println(car2.getMake());
		System.out.println(car2.getName());
		System.out.println(car2.getYear());
		
		
		
	}

}
