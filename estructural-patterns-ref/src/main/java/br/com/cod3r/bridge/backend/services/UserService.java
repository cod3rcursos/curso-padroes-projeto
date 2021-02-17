package br.com.cod3r.bridge.backend.services;

import br.com.cod3r.bridge.backend.dao.UserDao;
import br.com.cod3r.bridge.backend.model.User;

public abstract class UserService {
	protected UserDao dao;

	public UserService(UserDao dao) {
		this.dao = dao;
	}
	
	public abstract void save(User user);
}
