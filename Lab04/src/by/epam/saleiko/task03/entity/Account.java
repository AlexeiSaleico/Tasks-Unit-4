package by.epam.saleiko.task03.entity;

import java.util.Objects;

public class Account {
	private int balance;
	private boolean blocked;
	
	Account (int balance){
		this.balance = balance;
		blocked = false;
	}
	
	public void block() {
		blocked = true;
	}
	
	public void unblock() {
		blocked = false;
	}
	
	public void increace(int n) {
		balance += n;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public boolean isBlocked() {
		return blocked;
	}
	
	@Override
	public boolean equals(Object o) {
		if( o == null) return false;
		if ( this == o) return true;
		if (!(o instanceof Account)) return false;
		return ((Account)o).balance == balance && ((Account)o).blocked == blocked;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(balance,blocked);
	}
	
	@Override
	public String toString() {
		return blocked ? (balance + " blocked") : (balance + " active");
	}
	
}
