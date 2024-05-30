package inheritance;

public class College1 extends University1 {

	String colname,loc,principal;
	int code;
	
	public College1() {}

	public College1(String name, String place, String vc, int uno,String colname, String loc, String principal, int code) {
		this.name = name;
		this.place = place;
		this.vc = vc;
		this.uno = uno;
		
		this.colname = colname;
		this.loc = loc;
		this.principal = principal;
		this.code = code;
	}
	public void displayCollege1()
	{
		displayUniversity1();
		System.out.println("College Name :"+colname);
		System.out.println("place :"+loc);
		System.out.println("Principal :"+principal);
		System.out.println("code:"+code);
		
	}
	

}
