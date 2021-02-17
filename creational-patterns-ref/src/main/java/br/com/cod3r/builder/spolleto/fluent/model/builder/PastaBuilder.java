package br.com.cod3r.builder.spolleto.fluent.model.builder;

import java.util.Arrays;
import java.util.List;

import br.com.cod3r.builder.spolleto.fluent.model.Pasta;
import br.com.cod3r.builder.spolleto.fluent.model.Size;

public class PastaBuilder {
	//Mandatory
	protected Size size;
	
	//Optional
	protected List<String> toppings;
	protected List<String> sauces;
	protected boolean cheese;
	protected boolean pepper;
	
	public PastaBuilder(Size size) {
		this.size = size;
	}

	public PastaBuilder withSauces(String... sauces) {
		this.sauces = Arrays.asList(sauces);
		return this;
	}

	public PastaBuilder withToppings(String... toppings) {
		this.toppings = Arrays.asList(toppings);
		return this;
	}

	public PastaBuilder withCheese() {
		this.cheese = true;
		return this;
	}

	public PastaBuilder withPepper() {
		this.pepper = true;
		return this;
	}
	
	public Pasta now() {
		return new Pasta(toppings, sauces, size, cheese, pepper);
	}
}
