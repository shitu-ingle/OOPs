package inheritance;

public class RX100 extends Bike {
 String brand;
 String color;
 double price;
 int mileage;
 
	public RX100() {}

	public RX100(int wheels, int seats, String fule,String brand, String color, double price, int mileage) {
		this.wheels = wheels;
		this.seats = seats;
		this.fule = fule;
		
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.mileage = mileage;
	}
	public void displayRX100()
    {
		System.out.println("Wheels :"+wheels);
		System.out.println("Seats :"+seats);
		System.out.println("Fule :"+fule);
		System.out.println("Brand :"+brand);
		System.out.println("Color :"+color);
		System.out.println("Price :"+price);
		System.out.println("Mileage :"+mileage);
		System.out.println("======================================");
    }
	
	

}
