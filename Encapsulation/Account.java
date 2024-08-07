package encapsulation;

public class Account {

		private String bankname;
		private int accno;
		private double balance;
		private String type;
		private int pin;
		private String name;
		Account(){}
		public Account(String bankname, int accno, double balance, String type, int pin, String name) {
			super();
			this.bankname = bankname;
			this.accno = accno;
			this.balance = balance;
			this.type = type;
			this.pin = pin;
			this.name = name;
			System.out.println("Account successfully created!");
		}
		public String getBankname() {
			return bankname;
		}
		public int getAccno() {
			return accno;
		}
		public void setAccno(int accno) {
			this.accno = accno;
		}
		public double getBalance(int accno,int pin) {
			
			if(this.accno==accno && this.pin==pin)
			{
			return balance;
			}
			System.out.println("Invalid Credentials!");
			return 0;
		}	
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public void setPin(int accno,int oldpin,int newpin) {
			if(this.accno==accno && this.pin==oldpin)
			{
				pin=newpin;
				System.out.println("Pin reset successfully!");
			}
			else
			{
				System.out.println("plz check your account details!");
			}
		}
		public String getName() {
			return name;
		}
		
	public void withdraw(int accno,int pin,double amount)
	{
		if(this.accno==accno && this.pin==pin)
		{
			if((balance -amount)>=1000)
			{
				balance-=amount;
				System.out.println("Amount deducted!");
				System.out.println("Your balance is :"+balance);
			}
			else
			{
				System.out.println("Insufficient balance!");
			}
		}
		else
		{
			System.out.println("plz recheck account details!");
		}
	}
public void deposit(int accno,int pin,double amount)
    {
	   if(this.accno==accno && this.pin==pin)
	   {
		   balance += amount;
		   System.out.println("deposit successfully done !");
		   System.out.println("Your balance is "+balance);
	   }
	   else
	   {
		   System.out.println("plz recheck account details!"); 
	   }
	}
}
