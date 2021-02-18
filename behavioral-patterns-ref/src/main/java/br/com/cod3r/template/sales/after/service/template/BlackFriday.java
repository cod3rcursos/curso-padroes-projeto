package br.com.cod3r.template.sales.after.service.template;

import java.util.Calendar;

import br.com.cod3r.template.sales.after.model.Cart;

public class BlackFriday extends BestOfferTemplate {

	public BlackFriday(Cart cart) {
		super(cart);
	}

	@Override
	public boolean isAppliable() {
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.MONTH) == Calendar.NOVEMBER;
	}

	@Override
	protected void calibrateVariables() {
		priceFactor = 0.75d;
	}
}
