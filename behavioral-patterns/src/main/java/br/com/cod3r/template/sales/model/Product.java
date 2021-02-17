package br.com.cod3r.template.sales.model;

public class Product {
	private String desc;
	private Double value;
	private Category category;
	private Double weight;
	
	public Product(String desc, Double value, Category category, Double weight) {
		this.desc = desc;
		this.value = value;
		this.category = category;
		this.weight = weight;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}
}


