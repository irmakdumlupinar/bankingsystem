package bankingystem;

import java.util.ArrayList;

public abstract class Customer {
	private static int totalIndividualCustomers = 0;
	private static int totalInstitutionalCustomers = 0;
	private String name;
	private String address;
	private String contactDetails; // iletişim bilgileri
	private ArrayList<Account> accounts;

	public Customer(String name, String address, String contactDetails) {
		this.name = name;
		this.address = address;
		this.contactDetails = contactDetails;
		accounts = new ArrayList<Account>();

	}

	public static int getTotalIndividualCustomers() {
		return totalIndividualCustomers;
	}

	public static void setTotalIndividualCustomers(int totalIndividualCustomers) {
		Customer.totalIndividualCustomers = totalIndividualCustomers;
	}

	public static int getTotalInstitutionalCustomers() {
		return totalInstitutionalCustomers;
	}

	public static void setTotalInstitutionalCustomers(int totalInstitutionalCustomers) {
		Customer.totalInstitutionalCustomers = totalInstitutionalCustomers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

	public static void increaseIndividualCustomerCount() {
		totalIndividualCustomers++;
	}

	// Method to increase institutional customer count
	public static void increaseInstitutionalCustomerCount() {
		totalInstitutionalCustomers++;
	}

	public abstract void printİnfo();

	public abstract double computeBalanceOneYearLater(Account account, double interestRate);

}
