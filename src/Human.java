
public class Human {
	String name;
	int age;
	String coloreyes;
	
	Human(String name){
		this.name = name;
	
		
	}
	
	Human(String name, int age, String coloreyes){
		this.name = name;
		this.age = age;
		this.coloreyes = coloreyes;
		
	}
	
	
	void eat(){
		System.out.println("You are eating "+this.name);
	}
}
