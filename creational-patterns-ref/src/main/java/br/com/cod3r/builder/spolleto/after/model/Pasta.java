package br.com.cod3r.builder.spolleto.after.model;

import java.util.List;

public class Pasta extends Meal {

	public Pasta(List<String> toppings, List<String> sauces, Size size, boolean cheese, boolean pepper) {
		super(toppings, sauces, size, cheese, pepper);
	}

	@Override
	public String toString() {
		return "Pasta [toppings=" + toppings + ", sauces=" + sauces + ", size=" + size + ", cheese=" + cheese
				+ ", pepper=" + pepper + "]";
	}
}
