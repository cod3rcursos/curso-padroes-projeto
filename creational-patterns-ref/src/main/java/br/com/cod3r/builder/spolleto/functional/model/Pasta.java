package br.com.cod3r.builder.spolleto.functional.model;

import java.util.Arrays;
import java.util.List;

public class Pasta {
	final private List<String> toppings;
	final private List<String> sauces;
	final private Size size;
	final private boolean cheese;
	final private boolean pepper;
	
	private Pasta(List<String> toppings, List<String> sauces, Size size, boolean cheese, boolean pepper) {
		this.toppings = toppings;
		this.sauces = sauces;
		this.size = size;
		this.cheese = cheese;
		this.pepper = pepper;
	}

	public List<String> getToppings() {
		return toppings;
	}

	public List<String> getSauces() {
		return sauces;
	}

	public Size getSize() {
		return size;
	}

	public boolean isCheese() {
		return cheese;
	}

	public boolean isPepper() {
		return pepper;
	}

	@Override
	public String toString() {
		return "Pasta [toppings=" + toppings + ", sauces=" + sauces + ", size=" + size + ", cheese=" + cheese
				+ ", pepper=" + pepper + "]";
	}
	
	public static class Builder {
		//Mandatory
		protected Size size;
		
		//Optional
		protected List<String> toppings;
		protected List<String> sauces;
		protected boolean cheese;
		protected boolean pepper;
		
		public Builder(Size size) {
			this.size = size;
		}

		public Builder withSauces(String... sauces) {
			this.sauces = Arrays.asList(sauces);
			return this;
		}

		public Builder withToppings(String... toppings) {
			this.toppings = Arrays.asList(toppings);
			return this;
		}

		public Builder withCheese() {
			this.cheese = true;
			return this;
		}

		public Builder withPepper() {
			this.pepper = true;
			return this;
		}
		
		public Pasta now() {
			return new Pasta(toppings, sauces, size, cheese, pepper);
		}
	}
}
