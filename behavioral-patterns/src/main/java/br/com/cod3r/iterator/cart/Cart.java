package br.com.cod3r.iterator.cart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cart {
	List<Product> products = new ArrayList<Product>();
	
	public Cart(Product... products) {
		this.products = Arrays.asList(products);
	}
}
