package br.com.cod3r.bridge.mvc.dao;

import br.com.cod3r.bridge.mvc.model.User;

public class UserPostgresDao{

	public void save(User user) {
		System.out.println("Saving the user in the Postgres Database!");
	}
}
