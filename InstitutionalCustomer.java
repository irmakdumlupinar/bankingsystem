package bankingystem;

public class InstitutionalCustomer extends Customer implements AccountManager {
	private String typeOfInstitution;// kurum türü : şirket, ortaklık, dvelet
	private String industrySector;// sanayi türü: finans,sağlık,üretim
	private double annualRevenue;// yıllık gelir

	public InstitutionalCustomer(String name, String address, String contactDetails, String typeOfInstitution,
			String industrySector, double annualRevenue) {
		super(name, address, contactDetails);
		this.typeOfInstitution = typeOfInstitution;
		this.industrySector = industrySector;
		this.annualRevenue = annualRevenue;
		// Increase institutional customer count
		Customer.increaseInstitutionalCustomerCount();
	}

	public String getTypeOfInstitution() {
		return typeOfInstitution;
	}

	public void setTypeOfInstitution(String typeOfInstitution) {
		this.typeOfInstitution = typeOfInstitution;
	}

	public String getIndustrySector() {
		return industrySector;
	}

	public void setIndustrySector(String industrySector) {
		this.industrySector = industrySector;
	}

	public double getAnnualRevenue() {
		return annualRevenue;
	}

	public void setAnnualRevenue(double annualRevenue) {
		this.annualRevenue = annualRevenue;
	}

	@Override
	public void printİnfo() {
		System.out.println("Name: " + super.getName());
		System.out.println("Adress: " + super.getAddress());
		System.out.println("Contact details: " + super.getContactDetails());
		System.out.println("Type Of Institution: " + typeOfInstitution);
		System.out.println("Industry Sector: " + industrySector);
		System.out.println("Annual Revenue: " + annualRevenue);
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
		// TODO Auto-generated method stub

	}

	@Override
	public double computeBalanceOneYearLater(Account account, double interestRate) {
		double newgelir = account.getBalance() * (1 + 0.03);
		return newgelir;
	}

}
