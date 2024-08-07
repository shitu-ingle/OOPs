package inheritance;

public class Cardiologist extends Doctor {
String spl,hospital,organ;
			public Cardiologist() {
				// TODO Auto-generated constructor stub
			}
			public Cardiologist(String drname, String degree, double fee,String spl,
					String hospital,String organ) {
				
				this.drname = drname;
				this.degree = degree;
				this.fee = fee;
			    
				this.spl = spl;
				this.hospital = hospital;
				this.organ = organ;
			}
			public void displayCardio()
			{ displayDoctor();
				System.out.println("Specialization : "+spl);
				System.out.println("Hospital: "+hospital);
				System.out.println("Organ : "+organ);
				System.out.println("===================================");
			}

		}