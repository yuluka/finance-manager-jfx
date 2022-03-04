package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import exceptions.InformationNotFilledException;
import exceptions.TypeNotSelectedException;

public class FinanceManagerData {
	private ArrayList<Expense> expenses;
	private ArrayList<Income> incomes;
	
	public FinanceManagerData() {
		expenses = new ArrayList<>();
		incomes = new ArrayList<>();
	}
	
	public void addExpenseOrIncome(double amount, String description, String dateStr, int type) throws ParseException {
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
		
		if(description.isEmpty() || dateStr.isEmpty() || amount == 0) {
			throw new InformationNotFilledException();
		}else if(type == 0) {
			throw new TypeNotSelectedException();
		}else if(type == 1){
			expenses.add(new Expense(amount, description, date));
		}else {
			incomes.add(new Income(amount, description, date));
		}
	}
}
