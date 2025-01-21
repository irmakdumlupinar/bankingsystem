package bankingystem;

public class IndividualCustomer extends Customer implements TransactionExecutor, AccountManager {
	private String gender;
	private String identificationInfo;
	private String occupation;
	private IndividualCustomer individualCustomer;

	public IndividualCustomer(String name, String address, String contactDetails, String gender,
			String identificationInfo, String occupation) {
		super(name, address, contactDetails);
		this.gender = gender;
		this.identificationInfo = identificationInfo;
		this.occupation = occupation;
		Customer.increaseIndividualCustomerCount();
	}

	// Getters and setters
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIdentificationInfo() {
		return identificationInfo;
	}

	public void setIdentificationInfo(String identificationInfo) {
		this.identificationInfo = identificationInfo;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	@Override
	public void printİnfo() {
		System.out.println("Name: " + super.getName());
		System.out.println("Adress: " + super.getAddress());
		System.out.println("Contact details: " + super.getContactDetails());
		System.out.println("Gender: " + gender);
		System.out.println("identification Info: " + identificationInfo);
		System.out.println("Job: " + occupation);
	}

	@Override
	public void deposit(double amount, Account account) {
		// Belirli bir hesaba belirli bir miktar para yatırma işlemi gerçekleştirilir
		// Önce miktarın geçerli olup olmadığını kontrol edelim
		if (amount <= 0) {
			System.out.println("Deposit amount must be greater than zero.");
			return;
		}
		// Hesaba para yatırma işlemi yapılır
		account.setBalance(account.getBalance() + amount);

		System.out.println(amount + " deposited to account " + account.getAccountNumber() + ".");

	}

	@Override
	public void withdraw(double amount, Account account) {
		if (amount <= 0) {
			System.out.println("Withdrawal amount must be greater than zero.");
			return;
		}

		if (amount > account.getBalance()) {
			System.out.println("Insufficient funds. Withdrawal amount exceeds account balance.");
			return;
		}

		// Hesaptan para çekme işlemi yapılır
		account.setBalance(account.getBalance() - amount);

	}

	@Override
	public void transfer(double amount, Account fromAccount, Account toAccount) {
		if (amount <= 0) {
			System.out.println("Transfer amount must be greater than zero.");
			return;
		}

		if (amount > fromAccount.getBalance()) {
			System.out.println("Insufficient funds. Transfer amount exceeds account balance.");
			return;
		}

		// Hesaptan para çekme işlemi yapılır
		fromAccount.setBalance(fromAccount.getBalance() - amount);

	}

	@Override
	public void createAccount(Customer customer, String accountType) {
		Account account = new SavingsAccount(customer, accountType);
		super.getAccounts().add(account);

	}

	@Override
	public void displayAccountDetails(Account account) {
		for (Account accounts : super.getAccounts()) {
			System.out.println("Account Number: " + account.getAccountNumber());
			System.out.println("Balance: " + account.getBalance());
			System.out.println("Owner: " + account.getOwner().getName());
		}

	}

	@Override
	public void updateContactDetails(Customer customer, String newContactDetails) {
		this.individualCustomer = new IndividualCustomer(getName(), getAddress(), newContactDetails, getGender(),
				identificationInfo, occupation);

	}

	@Override
	public double computeBalanceOneYearLater(Account account, double interestRate) {
		double newgelir = account.getBalance() * (1 + interestRate);
		return newgelir;
	}

}