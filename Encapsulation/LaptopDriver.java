package encapsulation;

public class LaptopDriver {

	public static void main(String[] args) {
		Laptop l1=new Laptop("Dell", 450000, 64, 4,"Black");
		l1.displayLaptop();
		
		l1.insertPendrive("Sna_Disk", 1000, 128, 5); // lazy binding
		l1.p1.display();

	}

}
