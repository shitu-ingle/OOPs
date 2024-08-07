package encapsulation;

public class AccountDriver {

	public static void main(String[] args) {
		Account s1=new Account("Axis Bank",1234567890,50000,"Saving",1234,"Manja");
		s1.withdraw(1234567890, 1234, 5000);
		s1.setPin(1234567890, 1234, 1212);
		s1.deposit(1234567890, 1212, 1300);
		System.out.println("Bank Name ="+s1.getBankname());

	}

}
