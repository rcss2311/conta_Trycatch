package model.entities;

import model.exceptions.DominioException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance, Double withDraw) throws DominioException {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDraw;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}
	
	public void withDraw(double value) throws DominioException {
		if(value > balance) {
			throw new DominioException("Not enough balance!");
		}else if(value > withDrawLimit) {
			throw new DominioException("The amount exceeds withdraw limit!");
		}
		balance-=value;
	}
	public void deposit(double value) {
		balance+=value;
	}
	
	
	

}
