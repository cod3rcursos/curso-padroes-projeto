package br.com.cod3r.template.persist.models;

public class UserModel extends ModelPersist {
	protected String username;
	protected String password;
	
	public UserModel(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	protected void preSave() {
		System.out.println("Checking if there is another user with the same username");
	}
	
	@Override
	protected void prePersist() {
		if(username == null) throw new RuntimeException("Username is mandatory.");
		if(password == null) throw new RuntimeException("password is mandatory.");
	}

	@Override
	protected void postSave() {
		System.out.println("Creating user roles");
	}
}
