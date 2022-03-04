package model;

import java.util.Date;

public class Income {
	private double amount;
	private String description;
	private Date date;
	
	public Income(double amount, String description, Date date) {
		this.amount = amount;
		this.description = description;
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
