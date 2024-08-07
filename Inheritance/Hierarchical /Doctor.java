package inheritance;

public class Doctor {

	String drname,degree;
	double fee;
	
	public Doctor() {}

	public Doctor(String drname, String degree, double fee) {
		
		this.drname = drname;
		this.degree = degree;
		this.fee = fee;
	}
	public void displayDoctor()
	{
		System.out.println("Doctor Name : "+drname);
		System.out.println("Degree : "+degree);
		System.out.println("Fees : "+fee);
		System.out.println("===================================");
	}

}
