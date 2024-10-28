// Chloe Becker
// COP 3330
// 9/14/2024
// Bank

import java.util.Scanner;

public class Bank {
	private static Account[] name = new Account[5];
	static Scanner scan = new Scanner(System.in);
	
	public static String createAccount(int num) {
		System.out.println("Creating a new account.");
		System.out.println("What is the name of the account:");
		String nameAccount = scan.nextLine();

		System.out.println("What is the interest rate?");
		double intrestAccount = scan.nextDouble();
		
		Account newAccount = new Account(nameAccount, intrestAccount);
		name[num] = newAccount;

		return nameAccount;
	}
	
	public static void accountActions(int num) {
		
		
		System.out.println("What would you like to do?");
		System.out.println("1. Deposit Funds");
		System.out.println("2. Withdraw Funds");
		System.out.println("3. Check Balance");
		System.out.println("4. Calculate Intrest");
		System.out.println("5. Delete Account");
		System.out.println("What would you like to do?");
		int option = scan.nextInt();
		
		switch(option) {
		case 1:
			System.out.println("How much money would you like to deposit?");
			double money = scan.nextDouble();
			
			if (name[num].deposit(money) == false) {
				System.out.println("This is an invalid amount");
			}
			else {
				System.out.printf("You have added  $%.2f.\n", money);
			}
			break;
		case 2:
			System.out.println("How much money would you like to withdraw?");
			double money2 = scan.nextDouble();
			
			if (name[num].withdraw(money2) == false) {
				System.out.println("This is an invalid amount");
			}
			else {
				System.out.printf("You have withdrawn $%.2f.\n", money2);
			}
			break;
		case 3:
			double money3 = name[num].getBalance();
			System.out.printf("You have $%.2f.\n", money3);
			break;
		case 4:
			System.out.println("How many months have past?");
			int years = scan.nextInt();
			name[num].calcIntrest(years);
			break;
		case 5:
			System.out.println("Account closed");
			name[num] = null;
			break;
		default: 
			break;
		}
	}
		
	public static void main(String[] args) {

		System.out.println("Welcome to Knightro Banking: ");
		int option = 9;
		while(option != 6) {

			for (int i = 0; i<5; i++) {
				if (name[i] == null) {
					System.out.println(i+1  +  ". Empty");
				}
				else {
					System.out.println(i+1  +  ". " + name[i].getName());
				}
			}
			
			System.out.println("6. Exit");
			System.out.println("What would you like to do?");

			option = scan.nextInt();
			scan.nextLine();
			
			switch (option) {
			case 1:
				if (name[option-1] == null) {
					createAccount(0);
				} else {
					accountActions(0);

				}
				break;
			case 2:
				if (name[option-1] == null) {
					createAccount(1);
				} else {
					accountActions(1);
				}
				break;
			case 3:
				if (name[option-1] == null) {
					createAccount(2);
				} else {
					accountActions(2);
				}
				break;
			case 4:
				if (name[option-1] == null) {
					createAccount(3);
				} else {
					accountActions(3);
				}
				break;
			case 5:
				if (name[option-1] == null) {
					createAccount(4);
				} else {
					accountActions(4);
				}
			case 6:
				System.out.println("Goodbye.");
				break;
			}
		}
		scan.close();
	}
}

