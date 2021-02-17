package br.com.cod3r.mediator.translate.mediator;

import java.util.HashMap;
import java.util.Map;

import br.com.cod3r.mediator.translate.model.User;

public abstract class Mediator {
	protected Map<String, User> users = new HashMap<String, User>();

	public void addUser(User user) {
		System.out.println(String.format("'%s' is in the room", user.getName()));
		users.put(user.getName(), user);
	}
	
	public void removeUser(User user) {
		System.out.println(String.format("'%s' is out", user.getName()));
		users.remove(user.getName());
	}

	public void sendMessage(String message, User to, User from) {
		if (to == null) {
			for (User user : users.values()) {
				if (user.getName() == from.getName())
					continue;
				user.receiveMessage(getMessage(message, user, from), from);
			}
		} else {
			to.receiveMessage(getMessage(message, to, from), from);
		}
	}

	protected abstract String getMessage(String message, User to, User from);
}
