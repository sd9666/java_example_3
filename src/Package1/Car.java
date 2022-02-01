package Package1;

public class Car {
	private String make;
	private String name;
	private int year;
	
	Car(String make, String name, int year){
		this.make = make;
		this.name = name;
		this.year = year;
		
	}
	
	public String getMake() {
		return make;
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	
	public void setMake(String make) {
		this.make = make;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void copy(Car x) {
	this.setMake(x.getMake());
	this.setName(x.getName());
	this.setYear(x.getYear());
	
		
	}
}
