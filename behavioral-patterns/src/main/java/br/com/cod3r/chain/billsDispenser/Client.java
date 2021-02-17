package br.com.cod3r.chain.billsDispenser;

public class Client {

	public static void main(String[] args) {
		Dispenser atm = new Dispenser();
		atm.withdraw(230);
		System.out.println("-----------");
		atm.withdraw(66);
	}
}
