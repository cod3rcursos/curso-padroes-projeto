package br.com.cod3r.builder.meal.after.builder;

public class Menu1Builder extends FastFoodMealBuilder {
	@Override
	public void buildDrink() {
		meal.setDrink("Coke");
	}

	@Override
	public void buildMain() {
		meal.setMain("Cheeseburguer");
	}

	@Override
	public void buildSide() {
		meal.setSide("Fries");
	}

	@Override
	public void buildDessert() {
		meal.setDessert("Apple Pie");
	}

	@Override
	public void buildGift() {
		meal.setToy("Avenger's Toy");
	}
}
