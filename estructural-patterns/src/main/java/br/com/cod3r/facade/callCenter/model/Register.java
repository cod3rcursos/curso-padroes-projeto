package br.com.cod3r.facade.callCenter.model;

import java.util.Date;

public class Register {
	private String storeName;
	private Double value;
	private Date date;
	
	public Register(String storeName, Double value, Date date) {
		this.storeName = storeName;
		this.value = value;
		this.date = date;
	}
	
	public String getStoreName() {
		return storeName;
	}
	
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	public Double getValue() {
		return value;
	}
	
	public void setValue(Double value) {
		this.value = value;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Register [storeName=" + storeName + ", value=" + value + ", date=" + date + "]";
	}
}
