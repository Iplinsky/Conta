package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account acc1 = new Account(1001, "Thiago", 1000.0);
		acc1.withdraw(200.0);
		
		System.out.println(acc1.getBalance());
		
		
		Account acc2 = new SavingsAccount(1002, "Ana", 1000.0, 0.01);
		acc2.withdraw(200.0);
		
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Jhon", 1000.0, 500.0);
		acc3.withdraw(200.0);
		
		System.out.println(acc3.getBalance());
		
		
		sc.close();
		
		
	}

}
