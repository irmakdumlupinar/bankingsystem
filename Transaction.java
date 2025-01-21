package bankingystem;

import java.util.Date;

public class Transaction {
	private int transactionID;
	private double amount;
	private Date date;
	private String type; // para çekme- yatırma

	public Transaction(int transactionID, double amount, Date date, String type) {
		this.transactionID = transactionID;
		this.amount = amount;
		this.date = date;
		this.type = type;
	}
 public void printInfo() {
	 System.out.println("transaction ID: "+ transactionID);
	 System.out.println("Amount: "+ amount);
	 System.out.println("Date: "+ date);
	 System.out.println("Type: "+ type);
 }

	public int getTransactionID() {
		return transactionID;
	}
	 

	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
