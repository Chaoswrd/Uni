package bankKontoApp;


public class Bankkonto {
	private static String nbr="";
	private static double balance=0;
	
	public void credit(double amount){
		balance+=amount;
	}
	public void withdraw(double amount){
		balance-=amount;
	}
	
	public String getNbr() {
		return nbr;
	}
	public double getBalance() {
		return balance;
	}
}
