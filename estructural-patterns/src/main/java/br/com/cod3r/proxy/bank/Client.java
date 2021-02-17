package br.com.cod3r.proxy.bank;

import br.com.cod3r.proxy.bank.services.Bank;
import br.com.cod3r.proxy.bank.services.BankOperations;

public class Client {

	public static void main(String[] args) {
		BankOperations bank = new Bank();
		bank.deposit(123L, 500L);
		bank.withdraw(456L, "8888", 50L);
		bank.withdraw(456L, "9999", 50L);
		bank.withdraw(123L, "1234", 2000L);
		bank.changePassword(123L, "1111", "4321");
		bank.changePassword(123L, "1234", "4321");
		bank.withdraw(123L, "4321", 700L);
		
		System.out.println("------------- ATM -------------");
		
	}
}
