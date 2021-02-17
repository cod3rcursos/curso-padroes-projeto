package br.com.cod3r.chain.billsDispenser;

public class Dispenser {
	
	public void withdraw(Integer ammount) {
		Integer remaining = ammount;
		System.out.println("Calculating bills set for $" + ammount);
		if(remaining >= 50) {
			int bills = remaining / 50;
			remaining %= 50;
			System.out.println(String.format("- %d bill(s) of $%d, $%d remaining", bills, 50, remaining));
		}
		if(remaining >= 10) {
			int bills = remaining / 10;
			remaining %= 10;
			System.out.println(String.format("- %d bill(s) of $%d, $%d remaining", bills, 10, remaining));
		}
		if(remaining >= 1) {
			int bills = remaining / 1;
			remaining %= 1;
			System.out.println(String.format("- %d bill(s) of $%d, $%d remaining", bills, 1, remaining));
		}
	}
}
