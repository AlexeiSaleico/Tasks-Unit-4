package by.epam.saleiko.task03.entity;

import java.util.Objects;

public class User {
	private Account[] accounts = new Account[0];
	
	public void addAccount(int n) {
		Account[] temp = accounts.clone();
		accounts = new Account[ temp.length+1 ];
		for( int i = 0; i < temp.length; i++)
			accounts[i] = temp[i];
		accounts[ accounts.length-1 ] = new Account(n);
	}
	
	public Account[] getAccounts() {
		return accounts;
	}
	
	public int positiveSum() {
		int sum = 0;
		for (int i = 0; i < accounts.length; i++)
			if (accounts[i].getBalance() > 0) sum += accounts[i].getBalance();
		return sum;
	}
	
	public int negativeSum() {
		int sum = 0;
		for (int i = 0; i < accounts.length; i++)
			if (accounts[i].getBalance() < 0) sum += accounts[i].getBalance();
		return sum;
	}
	
	public int fullSum() {
		int sum = 0;
		for (int i = 0; i < accounts.length; i++)
			sum += accounts[i].getBalance();
		return sum;
	}
	
	public Account[] findByBalance(int n) {
		Account[] res = new Account[0];
		for (int i = 0; i < accounts.length; i++)
			if (accounts[i].getBalance() == n) {
				Account[] temp = res.clone();
				res = new Account[temp.length + 1];
				for (int j = 0; j < temp.length; j++)
					res[j] = temp[j];
				res[temp.length] = accounts[i];	
			}
		return res;
	}
	public void blockAll() {
		for (int i = 0; i < accounts.length; i++)
			accounts[i].block();
	}
	
	public void unblockAll() {
		for (int i = 0; i < accounts.length; i++)
			accounts[i].unblock();
	}
	
	public void sort() {
		for (int i = 0; i < accounts.length - 1; i++)
			for(int j = i + 1; j < accounts.length; j++ )
				if(accounts[i].getBalance() > accounts[j].getBalance()) {
					Account temp = accounts[i];
					accounts[i] = accounts[j];
					accounts[j] = temp;
				}
	}
	
	@Override
	public String toString() {
		String res = "";
		for (int i = 0; i < accounts.length; i++) res += accounts[i].toString() + "\n";
		return res;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null) return false;
		if (o == this) return true;
		if (!(o instanceof User)) return false;
		if ( ((User)o).accounts.length != accounts.length) return false;
		for(int i = 0; i < accounts.length; i++)
			if(accounts[i] != ((User)o).accounts[i]) return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(accounts);
	}
}
