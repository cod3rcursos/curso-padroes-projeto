package br.com.cod3r.builder.spolleto.before.model;

import java.util.List;

public class Pasta {
	private List<String> toppings;
	private List<String> sauces;
	private Size size;
	private boolean cheese;
	private boolean pepper;
	
	public Pasta(Size size) {
		this.size = size;
	}

	public Pasta(List<String> sauces, Size size) {
		this.sauces = sauces;
		this.size = size;
	}

	public Pasta(List<String> toppings, List<String> sauces, Size size) {
		this.toppings = toppings;
		this.sauces = sauces;
		this.size = size;
	}

	public Pasta(List<String> toppings, List<String> sauces, Size size, boolean cheese) {
		this.toppings = toppings;
		this.sauces = sauces;
		this.size = size;
		this.cheese = cheese;
	}

	public Pasta(List<String> toppings, List<String> sauces, Size size, boolean cheese, boolean pepper) {
		this.toppings = toppings;
		this.sauces = sauces;
		this.size = size;
		this.cheese = cheese;
		this.pepper = pepper;
	}

	@Override
	public String toString() {
		return "Pasta [toppings=" + toppings + ", sauces=" + sauces + ", size=" + size + ", cheese=" + cheese
				+ ", pepper=" + pepper + "]";
	}
}
