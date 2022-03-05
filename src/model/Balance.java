package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Balance {
	private double income;
	private double expense;
	private Date date;
	private String dateStr;
	private double balance;
	
	public Balance(double income, double expense, Date date) {
		this.income = income;
		this.expense = expense;
		this.date = date;
		setDateStr();
		calculateBalance();
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public double getExpense() {
		return expense;
	}

	public void setExpense(double expense) {
		this.expense = expense;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public void setDateStr() {
		dateStr = new SimpleDateFormat("yyyy-MM-dd").format(date);
	}
	
	public String getDateStr() {
		return dateStr;
	}

	public void calculateBalance() {
		balance = income - expense;
	}

	public double getBalance() {
		return balance;
	}
}
