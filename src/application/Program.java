package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.TransactionException;

/* Verifies if the withdraw amount exceeds the client's balance
 * and if the withdraw amount exceeds the withdraw limit
 */

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Integer number;
		String holder;
		Double balance, withdrawLimit, amount;
		
		try {
		
		System.out.println("Enter account data:");
		System.out.print("Number: ");
		number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		holder = sc.nextLine();
		System.out.print("Initial balance: ");
		balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		withdrawLimit = sc.nextDouble();
		
		Account acc1 = new Account(number, holder, balance, withdrawLimit);
		
		System.out.print("Enter amount for withdraw: ");
		amount = sc.nextDouble();
		
		acc1.withdraw(amount);
		
		System.out.printf("New balance: %,.2f%n", acc1.getBalance());
		
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Input incorrect data");
		}
		catch(TransactionException te)
		{
			System.out.println(te.getMessage());
		}
		
		sc.close();
	}

}
