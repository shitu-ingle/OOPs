// Hierarchical inheritance

package inheritance;

public class DoctorDriver {

	public static void main(String[] args) {
		
	Orthopedic o1=new Orthopedic("Mahesh", "MBBS", 300, "MD","Apollo Hospital","Bones");
	o1.displayDoctor();
	o1.displayOrtho();
	
	Dentist d1=new Dentist("Shiva","BDS",200,"MDS","Poona Hospital","Teeth");
	d1.displayDoctor();
	d1.displayDentist();
	}

}
