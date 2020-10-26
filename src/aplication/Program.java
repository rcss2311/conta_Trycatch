package aplication;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DominioException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		try {
			
			System.out.println("Account Data:");
			System.out.println();
			
			System.out.print("Enter Account number: ");
			int number = sc.nextInt();
			System.out.print("Enter holder name: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Inicial Balance: $ ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: $ ");
			double withDrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withDrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: $ ");
			double value = sc.nextDouble();
			
			account.withDraw(value);
			System.out.println("New Balance: $ "+account.getBalance());
			
		}
		catch(DominioException e) {
			System.out.println("Withdraw error: "+ e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpect Error!");
		}
	}
	

}
