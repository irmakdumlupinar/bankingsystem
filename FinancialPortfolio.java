package bankingystem;

import java.util.ArrayList;

public class FinancialPortfolio {
	 private ArrayList<Account> accounts;

	    public FinancialPortfolio() {
	        this.accounts = new ArrayList<>();
	    }

	    public void addAccount(Account account) {
	        accounts.add(account);
	    }

	    public void removeAccount(Account account) {
	        accounts.remove(account);
	    }

	    public double calculateTotalValue() {
	        double totalValue = 0;
	        for (Account account : accounts) {
	            totalValue += account.getBalance();
	        }
	        return totalValue;
	    }

	    public void printAccountInformation() {
	        for (Account account : accounts) {
	            System.out.println("Account Number: " + account.getAccountNumber());
	            System.out.println("Balance: " + account.getBalance());
	            System.out.println("Owner: "+ account.getOwner().getName());
	            System.out.println();
	            System.out.println("-----------------------------------");
	        }
	    }

	    public static void comparePortfolios(FinancialPortfolio portfolio1, FinancialPortfolio portfolio2) {
	        double totalValue1 = portfolio1.calculateTotalValue();
	        double totalValue2 = portfolio2.calculateTotalValue();

	        if (totalValue1 > totalValue2) {
	            System.out.println("Portfolio 1 has higher total value.");
	        } else if (totalValue1 < totalValue2) {
	            System.out.println("Portfolio 2 has higher total value.");
	        } else {
	            System.out.println("Both portfolios have the same total value.");
	        }
	    }
	
}
