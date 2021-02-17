package br.com.cod3r.builder.meal.functional.model;

import br.com.cod3r.builder.meal.functional.model.FastFoodMeal;

public class FastFoodMeal {

	final private String drink;
	final private String main;
	final private String side;
	final private String dessert;
	final private String gift;
	
	public FastFoodMeal(String drink, String main, String side, String dessert, String gift) {
		this.drink = drink;
		this.main = main;
		this.side = side;
		this.dessert = dessert;
		this.gift = gift;
	}

	public String getDrink() {
		return drink;
	}

	public String getMain() {
		return main;
	}

	public String getSide() {
		return side;
	}

	public String getDessert() {
		return dessert;
	}

	public String getGift() {
		return gift;
	}

	@Override
	public String toString() {
		return "FastFoodMeal [drink=" + drink + ", main=" + main + ", side=" + side + ", dessert=" + dessert + ", gift="
				+ gift + "]";
	}
	
	public static class Builder {
		//Mandatory
		private String side;
		
		//Optionals
		private String drink;
		private String main;
		private String dessert;
		private String gift;
		
		public Builder(String side) {
			this.side = side;
		}

		public Builder forDrink(String drink) {
			this.drink = drink;
			return this;
		}
		
		public Builder andMain(String main) {
			this.main = main;
			return this;
		}

		public Builder andDessert(String dessert) {
			this.dessert = dessert;
			return this;
		}

		public Builder andGift(String gift) {
			this.gift = gift;
			return this;
		}
		
		public FastFoodMeal thatsAll() {
			return new FastFoodMeal(drink, main, side, dessert, gift);
		}
	}
}
