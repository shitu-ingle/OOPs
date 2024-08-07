package encapsulation;

public class Laptop {

	String name;
	double cost;
	int ram;
	int hd;
	String color;
	Pendrive p1=null;
	public Laptop() {}
	public Laptop(String name, double cost, int ram, int hd, String color) {
	
		this.name = name;
		this.cost = cost;
		this.ram = ram;
		this.hd = hd;
		this.color = color;
	}
	public void insertPendrive(String brand, double price, int memory, int speed) //he
	{
		p1=new Pendrive(brand,price,memory,speed);
		System.out.println("Pendrive inserted");
	}
	public void displayLaptop()
	{
		System.out.println("Name : "+name);
		System.out.println("Cost : "+cost);
		System.out.println("RAM : "+ram);
		System.out.println("Hard Disk : "+hd);
		System.out.println("Color : "+color);
		System.out.println("=============================================");
		
	}
}
