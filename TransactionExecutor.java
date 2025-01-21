package bankingystem;

public interface TransactionExecutor {

	void deposit(double amount, Account account);

	void withdraw(double amount, Account account);

	void transfer(double amount, Account fromAccount, Account toAccount);
}
