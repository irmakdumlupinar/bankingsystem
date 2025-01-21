package bankingystem;

public interface AccountManager {

	void createAccount(Customer customer, String accountType);

	void displayAccountDetails(Account account);

	void updateContactDetails(Customer customer, String newContactDetails);

}