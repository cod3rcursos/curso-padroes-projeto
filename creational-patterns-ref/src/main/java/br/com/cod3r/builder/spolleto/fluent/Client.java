package br.com.cod3r.builder.spolleto.fluent;

import br.com.cod3r.builder.spolleto.fluent.model.Pasta;
import br.com.cod3r.builder.spolleto.fluent.model.Size;
import br.com.cod3r.builder.spolleto.fluent.model.builder.PastaBuilder;

public class Client {

	public static void main(String[] args) {
		Pasta p1 = new PastaBuilder(Size.LARGE).now();
		System.out.println(p1);
		
		Pasta p2 = new PastaBuilder(Size.SMALL)
				.withToppings("Bacon", "Broccoli")
				.withSauces("Tomato")
				.withCheese()
				.now();
		System.out.println(p2);
		
		Pasta p3 = new PastaBuilder(Size.STANDARD)
				.withToppings("Garlic")
				.withSauces("Funghi", "Cheese")
				.withCheese()
				.withPepper()
				.now();
		System.out.println(p3);
	}
}
