package br.com.cod3r.builder.spolleto.before;

import java.util.Arrays;

import br.com.cod3r.builder.spolleto.before.model.Pasta;
import br.com.cod3r.builder.spolleto.before.model.Size;

public class Client {

	public static void main(String[] args) {
		Pasta p1 = new Pasta(Size.LARGE);
		System.out.println(p1);
		
		Pasta p2 = new Pasta(Arrays.asList("Bacon", "Broccoli"), Arrays.asList("Tomato"), Size.SMALL, true);
		System.out.println(p2);
		
		Pasta p3 = new Pasta(Arrays.asList("Garlic"), Arrays.asList("Funghi", "Cheese"), Size.STANDARD, false, true);
		System.out.println(p3);
		
	}
}
