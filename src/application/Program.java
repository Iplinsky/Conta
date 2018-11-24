package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		List <Account> list = new ArrayList<>();
		list.add(new SavingsAccount(1001, "Thiago", 1500.0, 0.01));
		list.add(new BusinessAccount(1002, "Ana Izabel", 1000.0, 400.0));
		list.add(new SavingsAccount(1003, "Max", 500.0, 0.01));
		list.add(new BusinessAccount(1004, "Anna", 1500.0, 400.0));
		
		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Saldo total: %.2f", sum);
		System.out.println();
		System.out.println("-------------------------------------------");
		
		for (Account acc : list) {
			acc.deposit(10.0);
		}
		
		for (Account acc : list) {
			System.out.printf("> Saldo atualizado da conta %d: " + "R$ %.2f%n", acc.getNumber(), acc.getBalance() );
		}
		
		sc.close();
		
		
	}

}
