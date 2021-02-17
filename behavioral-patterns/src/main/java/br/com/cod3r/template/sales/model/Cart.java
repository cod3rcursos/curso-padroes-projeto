package br.com.cod3r.template.sales.model;

import java.util.List;

public class Cart {
	private Buyer buyer;
	private List<Product> items;
	
	public Cart(Buyer buyer, List<Product> items) {
		this.buyer = buyer;
		this.items = items;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	public List<Product> getItems() {
		return items;
	}

	public void setItems(List<Product> items) {
		this.items = items;
	}
}
