package br.com.cod3r.proxy.bank.model;

public class User {
	private String name;
	private Long accountNumber;
	private String password;
	private Long balance;
	
	public User(String name, Long accountNumber, String password, Long cash) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.password = password;
		this.balance = cash;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long cash) {
		this.balance = cash;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", accountNumber=" + accountNumber + ", password=" + password + ", balance=" + balance
				+ "]";
	}
}
