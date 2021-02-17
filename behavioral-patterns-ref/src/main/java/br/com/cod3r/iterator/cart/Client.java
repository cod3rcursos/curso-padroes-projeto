package br.com.cod3r.iterator.cart;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Client {

	public static void main(String[] args) {
		Cart cart = new Cart(new Product("TV", 1000d), new Product("Shoe", 59.99d), new Product("Pencil", 0.5d));
		
		for(Product prod: cart) {
			System.out.println(String.format("%s = %.2f", prod.getDesc(), prod.getValue()));
		}
		
		Stream<Product> stream = StreamSupport.stream(cart.spliterator(), false);
		Double sum = stream.reduce(0d, (acc, prod) -> acc + prod.getValue(), Double::sum);
		System.out.println(sum);
	}
}
