package bankingystem;

import java.util.ArrayList;

public abstract class Account {
	private String accountype;
	private int accountNumber;// hesapno
	private double balance;// bakiye
	private Customer owner;// sahibi
	private ArrayList<Transaction> transactions;

	public Account(String accountype, Customer owner) {
		this.accountype = accountype;
		this.owner = owner;
	}

	public Account(int accountNumber, double balance, Customer owner, String accountype) {
		this.accountype = accountype;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.owner = owner;
		//this.transactions = new ArrayList<Transaction>();
	}

	public String getAccountype() {
		return accountype;
	}

	public void setAccountype(String accountype) {
		this.accountype = accountype;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Customer getOwner() {
		return owner;
	}

	public void setOwner(Customer owner) {
		this.owner = owner;
	}

	public abstract void printİnfo();

	public abstract void birsenesonrakigelir();

	public void comparegelir(Account a1, Account a2) {
		if (a1.accountype==a2.accountype) {
			if (a1.getBalance()<a2.getBalance()) {
				System.out.println(a1.accountNumber+ "hesabında daha fazla para var.");
			}else if (a1.getBalance()<a2.getBalance()) {
				System.out.println(a2.accountNumber+ "hesabında daha fazla para var.");

			}else {
			System.out.println(a1.accountNumber+ "hesabında ve "+ a2.accountNumber + "hesabında eşit para vardır.");
			}
		}else {
			System.out.println("hesaplar birbiri türünden olmadığı için karşılaştırma yapılamaz.");
		}
	}


}
