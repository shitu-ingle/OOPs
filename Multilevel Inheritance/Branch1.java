package inheritance;

public class Branch1 extends College1{
	String type,hod;
	int nolec,nostd;

	public Branch1() {}

	public Branch1(String name, String place, String vc, int uno, String colname, String loc, String principal,
			int code,String type,String hod,int nolec,int nostd) {
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
	}
	public void displayBranch1()
	{
		displayUniversity1();
		displayCollege1();
		System.out.println("Type :"+type);
		System.out.println("HOD :"+hod);
		System.out.println("Number of Lecture :"+nolec);
		System.out.println("Number of student :"+nostd);
	}
	
	
	
}
