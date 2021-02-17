package br.com.cod3r.template.sales.service;

import java.util.HashMap;
import java.util.Map;

import br.com.cod3r.template.sales.model.Cart;
import br.com.cod3r.template.sales.model.Category;

public class BestOfferService {
	Map<Category, Double> discountsByCategory;
	
	public BestOfferService() {
		discountsByCategory = new HashMap<Category, Double>();
		discountsByCategory.put(Category.ELETRONICS, 0.3);
		discountsByCategory.put(Category.CLOTHES, 0.05);
	}
	
	private Double calculateDeliveryTax(Cart cart) {
		Integer distance = cart.getBuyer().getDistance();
		Double totalWeight = cart.getItems().stream()
				.reduce(0d, (acc, item) -> acc + item.getWeight(), Double::sum);
		return (distance * totalWeight) / 100;
	}
	
	private Double calculateRegularItemsPrice(Cart cart) {
		return cart.getItems().stream()
				.reduce(0d, (acc, item) -> acc + item.getValue(), Double::sum);
	}
	

	private Double calculateItemsPriceWithCategoryDiscount(Cart cart) {
		return cart.getItems().stream()
				.reduce(0d, (acc, item) -> 
				acc + (item.getValue() * 
						(discountsByCategory.get(item.getCategory()) != null? 1 - discountsByCategory.get(item.getCategory()): 1d))
						, Double::sum);
	}

	public void calculateBestOffer(Cart cart) {
		Double regularItemsPrice = calculateRegularItemsPrice(cart);
		Double deliveryTax = calculateDeliveryTax(cart);
		System.out.println(String.format("Regular Items Price: %.2f", regularItemsPrice));
		System.out.println(String.format("Delivery Tax: %.2f", deliveryTax));
		
		Double currentPrice = regularItemsPrice + deliveryTax;
		System.out.println(String.format("Regular Price: %.2f", currentPrice));
		
		if(regularItemsPrice > 500) {
			currentPrice = regularItemsPrice;
			System.out.println(String.format("Delivery Tax Discount: %.2f", currentPrice));
		}
		if(cart.getBuyer().isSpecialClient()) {
			Double specialClientPrice = (regularItemsPrice * 0.85) + (deliveryTax * 0.5);
			System.out.println(String.format("Special Client Price: %.2f", specialClientPrice));
			if (currentPrice > specialClientPrice) 
				currentPrice = specialClientPrice;
		}
		if(regularItemsPrice > 1000) {
			Double over1000Price = (regularItemsPrice * 0.90) + deliveryTax;
			System.out.println(String.format("Over 1000 Price: %.2f", over1000Price));
			if (currentPrice > over1000Price) 
				currentPrice = over1000Price;
		}
		Double categoryDiscountsPrice = calculateItemsPriceWithCategoryDiscount(cart) + deliveryTax;
		System.out.println(String.format("Category Discount Price: %.2f", categoryDiscountsPrice));
		if (currentPrice > categoryDiscountsPrice) 
			currentPrice = categoryDiscountsPrice;
		
		// Temporary rule
		Double blackFridayPrice = (regularItemsPrice * 0.75) + deliveryTax;
		System.out.println(String.format("Black Friday Price: %.2f", blackFridayPrice));
		if (currentPrice > blackFridayPrice) 
			currentPrice = blackFridayPrice;
		
		System.out.println(String.format("Final Price: %.2f", currentPrice));
	}
}