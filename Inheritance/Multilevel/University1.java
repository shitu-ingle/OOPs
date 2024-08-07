package inheritance;

public class University1 {
  
	String name,place,vc;
	int uno;
	public University1() {}
	public University1(String name, String place, String vc, int uno) {
		this.name = name;
		this.place = place;
		this.vc = vc; // voice counselor
		this.uno = uno;
	}
	public void displayUniversity1()
	{
		System.out.println("Name :"+name);
		System.out.println("place :"+place);
		System.out.println("VC :"+vc);
		System.out.println("University No :"+uno);
		
	}
	

}
