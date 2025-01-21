package bankingystem;

import java.util.ArrayList;

public class SavingsAccount extends Account {
	private double interestRate;
	private String accountStatus;
	private ArrayList<Transaction> transactionHistory;

	public SavingsAccount(Customer customer, String accpuntype) {
      super(accpuntype, customer);
	}

	public SavingsAccount(int accountNumber, double balance, Customer owner, String accountype, double interestRate,
			String accountStatus) {
		super(accountNumber, balance, owner, accountype);
		this.interestRate = interestRate;
		this.accountStatus = accountStatus;
		this.transactionHistory = new ArrayList<Transaction>();
	}

	public double getInterestRate() {
		return interestRate;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public ArrayList<Transaction> getTransactionHistory() {
		return transactionHistory;
	}

	public void addTransaction(Transaction transaction) {
		transactionHistory.add(transaction);
	}

	@Override
	public void printİnfo() {
		System.out.println("Account number: " + super.getAccountNumber());
		System.out.println("Balance: " + super.getBalance());
		System.out.println("Owner: " + super.getOwner().getName());
		System.out.println("İnterest rate: " + getInterestRate());
		System.out.println("Account status: " + getAccountStatus());
//		System.out.print("Transaction history: ");
//		for (Transaction transaction : transactionHistory) {
//			System.out.print(transaction + ", ");
//		}
	}

	@Override
	public void birsenesonrakigelir() {
		double newgelir = super.getBalance() * (1 + interestRate);
		System.out.println(
				"faiz oranı yıllık %" + interestRate + " olarak hesaplandıüında 1 sene sonraki bütçe : " + newgelir);

	}

}
