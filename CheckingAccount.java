package bankingystem;

public class CheckingAccount extends Account {
	private final double faiz = 0.03; // 3%
	private boolean hasDebitCard;
	private boolean hasATMAccess;
	private boolean hasOnlineBankingAccess;


//	public public CheckingAccount(Customer customer, String accpuntype) {
//	      super(accpuntype, customer);
//		}
	
	public CheckingAccount(int accountNumber, double balance, Customer owner, String accountype, Boolean hasDebitCard,
			boolean hasATMAccess, boolean hasOnlineBankingAccess) {
		super(accountNumber, balance, owner, accountype);
		this.hasDebitCard = hasDebitCard;
		this.hasATMAccess = hasATMAccess;
		this.hasOnlineBankingAccess = hasOnlineBankingAccess;

	}

	public boolean isHasDebitCard() {
		return hasDebitCard;
	}

	public void setHasDebitCard(boolean hasDebitCard) {
		this.hasDebitCard = hasDebitCard;
	}

	public boolean isHasATMAccess() {
		return hasATMAccess;
	}

	public void setHasATMAccess(boolean hasATMAccess) {
		this.hasATMAccess = hasATMAccess;
	}

	public boolean isHasOnlineBankingAccess() {
		return hasOnlineBankingAccess;
	}

	public void setHasOnlineBankingAccess(boolean hasOnlineBankingAccess) {
		this.hasOnlineBankingAccess = hasOnlineBankingAccess;
	}

	@Override
	public void printİnfo() {
		System.out.println("Account number: " + super.getAccountNumber());
		System.out.println("Balance: " + super.getBalance());
		System.out.println("Owner: " + super.getOwner().getName());
		System.out.println("İnterest rate: " + faiz);
		System.out.println("Has debit card: " + hasDebitCard);
		System.out.println("Has ATM access: " + hasATMAccess);
		System.out.println("Has online banking access: " + hasOnlineBankingAccess);

	}

	@Override
	public void birsenesonrakigelir() {
		double newgelir = super.getBalance() * (1 + 0.03);
		System.out.println("faiz oranı yıllık %3 olarak hesaplandıüında 1 sene sonraki bütçe : " + newgelir);

	}

	

}
