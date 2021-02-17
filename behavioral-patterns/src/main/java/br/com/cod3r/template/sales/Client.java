package br.com.cod3r.template.sales;

import java.util.Arrays;

import br.com.cod3r.template.sales.model.Buyer;
import br.com.cod3r.template.sales.model.Cart;
import br.com.cod3r.template.sales.model.Category;
import br.com.cod3r.template.sales.model.Product;
import br.com.cod3r.template.sales.service.BestOfferService;

public class Client {

	public static void main(String[] args) {
		Buyer simpleBuyer1 = new Buyer("Simple #1", 1500, false);
		Buyer simpleBuyer2 = new Buyer("Simple #2", 3000, false);
		Buyer specialBuyer = new Buyer("Special #1", 500, true);
		Buyer specialBuyer2 = new Buyer("Special #2", 3000, true);
		
		Product notebook = new Product("Notebook", 999.99d, Category.ELETRONICS, 10d);
		Product shoes = new Product("Ultra Runnins shoes", 200d, Category.SPORTS, 1.25d);
		Product shorts = new Product("Denim shorts", 20d, Category.CLOTHES, 0.5d);
		Product mouse = new Product("Mouse", 10d, Category.ELETRONICS, 0.2d);
		
		Cart cart1 = new Cart(simpleBuyer1, Arrays.asList(notebook, shoes, shorts, mouse));
		Cart cart2 = new Cart(simpleBuyer2, Arrays.asList(notebook, shoes, shorts, mouse));
		Cart cart3 = new Cart(specialBuyer, Arrays.asList(notebook, shoes, shorts, mouse));
		Cart cart4 = new Cart(specialBuyer2, Arrays.asList(notebook, shoes, shorts, mouse));
		
		BestOfferService service = new BestOfferService();
		service.calculateBestOffer(cart1);
		System.out.println("--------------");
		service.calculateBestOffer(cart2);
		System.out.println("--------------");
		service.calculateBestOffer(cart3);
		System.out.println("--------------");
		service.calculateBestOffer(cart4);
	}
}
