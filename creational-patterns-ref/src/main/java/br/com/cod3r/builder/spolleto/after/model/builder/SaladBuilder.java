package br.com.cod3r.builder.spolleto.after.model.builder;

import br.com.cod3r.builder.spolleto.after.model.Salad;

public class SaladBuilder extends MealBuilderOpt {

	public Salad getResult() {
		return new Salad(toppings, sauces, size, cheese, pepper);
	}
}
