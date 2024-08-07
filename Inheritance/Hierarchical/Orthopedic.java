package inheritance;
		public class Orthopedic extends Doctor{
		 String spl,hospital,organ;
		 public Orthopedic() {}
			public Orthopedic(String drname, String degree, double fee,String spl,
					String hospital,String organ) {
				
				this.drname = drname;
				this.degree = degree;
				this.fee = fee;
			    
				this.spl = spl;
				this.hospital = hospital;
				this.organ = organ;
			}
			public void displayOrtho()
			{ displayDoctor();
				System.out.println("Specialization : "+spl);
				System.out.println("Hospital: "+hospital);
				System.out.println("Organ : "+organ);
				System.out.println("===================================");
			}

		}
