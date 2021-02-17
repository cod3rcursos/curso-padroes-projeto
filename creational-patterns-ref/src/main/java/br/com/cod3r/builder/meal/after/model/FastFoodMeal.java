package br.com.cod3r.builder.meal.after.model;

public class FastFoodMeal {

	private String drink;
	private String main;
	private String side;
	private String dessert;
	private String gift;
	
	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public String getDessert() {
		return dessert;
	}

	public void setDessert(String dessert) {
		this.dessert = dessert;
	}

	public String getToy() {
		return gift;
	}

	public void setToy(String toy) {
		this.gift = toy;
	}

	@Override
	public String toString() {
		return "Combo [drink=" + drink + ", main=" + main + ", side=" 
				+ side + ", dessert=" + dessert + ", gift=" + gift + "]";
	}
}
