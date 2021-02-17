package br.com.cod3r.observer.party.before;

import br.com.cod3r.observer.party.before.characters.Doorman;
import br.com.cod3r.observer.party.before.characters.Wife;

public class Client {

	public static void main(String[] args) {
		Doorman doorman = new Doorman();
		Wife wife = new Wife(doorman);
		
		wife.startPartyIfPossible();
		
		System.out.println("5 minutes later...");
		wife.startPartyIfPossible();
		
		System.out.println("5 minutes later...");
		wife.startPartyIfPossible();
		
		System.out.println("5 minutes later...");
		wife.startPartyIfPossible();
		
		System.out.println("5 minutes later...");
		wife.startPartyIfPossible();
		
		System.out.println("Husband is comming");
		doorman.setStatus(true);
		
		System.out.println("5 minutes later...");
		wife.startPartyIfPossible();
	}
}
