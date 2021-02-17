package br.com.cod3r.builder.spolleto.after.model;

import java.util.List;

public class Salad extends Meal {

	public Salad(List<String> toppings, List<String> sauces, Size size, boolean cheese, boolean pepper) {
		super(toppings, sauces, size, cheese, pepper);
	}

	@Override
	public String toString() {
		return "Salad [toppings=" + toppings + ", sauces=" + sauces + ", size=" + size + ", cheese=" + cheese
				+ ", pepper=" + pepper + "]";
	}
}
