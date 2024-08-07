// multi level inheritance

package inheritance;

public class StudentDriver1 {

	public static void main(String[] args) {
		
		Student1 s=new Student1("Amravati University", "Amravati","Burani sir",123456,"College of Engineering",
				"Khamgaon","Pohare mam",402,"SC","Irfan sir",10,40,"Shitu",111,1);
		
		s.displayUniversity1();
		System.out.println("===================================");
		s.displayCollege1();
		System.out.println("===================================");
		s.displayBranch1();
		System.out.println("===================================");
		s.displayStudent1();
	}

}
