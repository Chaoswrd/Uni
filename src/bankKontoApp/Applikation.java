package bankKontoApp;

import java.util.Scanner;

public class Applikation {
	
	static Bankkonto bk = new Bankkonto();

	static void getInput(){
		while(true){
			boolean addOrSub = false;
			int amount = 0;
			for(int i=0; i<3; i++){
				if(i==0)
					endProgramme();
				else if(i==1)
					addOrSub = inOrOut();
				else
					amount = transferAmount();
			}
			System.out.println(addOrSub);
			transfer(addOrSub, amount);
		}
	}
	
	private static void endProgramme(){
		System.out.print("Vill du avsluta? ");
		if(answer()=="J"){
			printSaldo();
			System.exit(0);
		}
	}
	private static boolean inOrOut(){
		System.out.print("Insättning eller uttag (0-insättning, 1-uttag): ");
		if(answer().matches("0"))
			return true;
		return false;
	}
	private static int transferAmount(){
		System.out.print("Ange belopp: ");
		int amount = Integer.parseInt(answer());
		return amount;
	}
	private static void transfer(boolean addOrSub, int amount){
		if(addOrSub){
			bk.credit(amount);
		}
		else{
			bk.withdraw(amount);
		}
		printSaldo();
	}
	
	private static String answer(){
		return new Scanner(System.in).next();
	}
	private static void printSaldo(){
		String str = new StringBuilder().append("Saldo: ")
				.append(bk.getBalance())
				.toString();
		System.out.println(str);
	}
}

