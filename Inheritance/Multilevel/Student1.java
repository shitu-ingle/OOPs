package inheritance;

public class Student1 extends Branch1{
   
	String stdname;
	int rollno,sem;
	
	public Student1() {}

	public Student1(String name, String place, String vc, int uno, String colname, String loc, String principal,
			int code, String type, String hod, int nolec, int nostd,String stdname,int rollno,int sem) {
		this.name=name;
		this.place = place;
		this.vc = vc;
		this.uno = uno;
		
		this.colname = colname;
		this.loc = loc;
		this.principal = principal;
		this.code = code;
		
		this.type = type;
		this.hod = hod;
		this.nolec = nolec;
		this.nostd = nostd;
		
		this.stdname=stdname;
		this.rollno=rollno;
		this.sem=sem;
	}
	public void displayStudent1()
	{
		displayUniversity1();
		displayCollege1();
		displayBranch1();
		System.out.println("Student Name :"+stdname);
		System.out.println("Roll Number :"+rollno);
		System.out.println("Semester :"+sem);
	}
	

}
