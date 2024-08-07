package abstraction;

public class LenovoDriver {

	public static void main(String[] args) {
		Windows w=new Windows();
		w.cal(2, 3);
		w.welcome("Shital");
		
		Linux l=new Linux();
		l.welcome("Shitu");
		l.cal(3,4);

	}

}
