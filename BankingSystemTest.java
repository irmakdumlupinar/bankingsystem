package bankingystem;

import java.util.Date;

public class BankingSystemTest {

	public static void main(String[] args) {
		// Bireysel bir müşteri oluşturun
		IndividualCustomer customer1 = new IndividualCustomer("John Doe", "123 Main St", "john@example.com", "Male",
				"123456789", "Engineer");
		
		// Portföy oluşturun
		FinancialPortfolio portfolio1 = new FinancialPortfolio();
		// Bireysel müşteri için iki tasarruf hesabını kontrol eden bir tane oluşturun
		SavingsAccount savingsAccount1 = new SavingsAccount(345, 35000, customer1, "Saving", 0.01, "active");
		SavingsAccount savingsAccount2 = new SavingsAccount(874, 45000, customer1, "Saving", 0.02, "active");
		
		// Tasarruf hesaplarını portföye ekleyin
		portfolio1.addAccount(savingsAccount1);
		portfolio1.addAccount(savingsAccount2);

		// Yatırılacak farklı miktarlarda para için üç işlem oluşturun
		Transaction transaction1 = new Transaction(123, 100, new Date(), "deposit");
		Transaction transaction2 = new Transaction(234, 200, new Date(), "withdraw");
		Transaction transaction3 = new Transaction(456, 300, new Date(), "deposit");
		// Have the customer deposit money to his/her accounts via the transactions created
        customer1.deposit(200.0, savingsAccount1);
       
		// Oluşturulan her hesap için hesap ayrıntılarını görüntüleyin
		System.out.println("Account Details:");
		System.out.println(customer1.getContactDetails());
		
		// Portföyün toplam değerini görüntüleyin
		System.out.println("Total Portfolio Value: " + portfolio1.calculateTotalValue());
		
		// Portföyden ikinci tasarruf hesabını kaldırın
		portfolio1.removeAccount(savingsAccount2);
		
		// Portföyün toplam değerini görüntüleyin
		System.out.println(
				"Total Portfolio Value after removing second savings account: " + portfolio1.calculateTotalValue());
		
		// Portföydeki tüm hesap bilgilerini yazdırın
		System.out.println("All Account Information in Portfolio:");
		portfolio1.printAccountInformation();

		
		// Başka bir bireysel müşteri oluşturun
		IndividualCustomer customer2 = new IndividualCustomer("Jane Smith", "456 Elm St", "jane@example.com", "Female",
				"987654321", "Doctor");

		// Başka bir portföy oluşturun
		FinancialPortfolio portfolio2 = new FinancialPortfolio();

		// İkinci bireysel müşteri için bir çek hesabı oluşturun
		CheckingAccount checkingAccount1 = new CheckingAccount(123, 50000, customer2, "Checking", true, true, true);

		// Oluşturulan çek hesabı için hesap ayrıntılarını görüntüleyin
		System.out.println("Checking Account Details:");
		System.out.println(customer2.getContactDetails());

		// Çek hesabını ikinci portföye ekleyin
		portfolio2.addAccount(checkingAccount1);
		// Display account details for each account created
        checkingAccount1.printİnfo();
        savingsAccount1.printİnfo();
        savingsAccount2.printİnfo();

        // Display total value of the portfolio
        System.out.println("Total value of portfolio 1: " + portfolio1.calculateTotalValue());

        // Remove the second savings account from the portfolio
        portfolio1.removeAccount(savingsAccount2);

        // Display total value of the portfolio
        System.out.println("Total value of portfolio 1 after removing second savings account: " + portfolio1.calculateTotalValue());

        // Print all account information in the portfolio
        portfolio1.printAccountInformation();

        // Create another individual customer
        IndividualCustomer customer3 = new IndividualCustomer("Jane Smith", "456 Oak St", "jane@example.com", "Female", "987654321", "Teacher");

        // Create another portfolio
        FinancialPortfolio portfolio3 = new FinancialPortfolio();

        // Create a checking account for the second individual customer
        CheckingAccount checkingAccount2 = new CheckingAccount(123, 5000, customer2, "Checking", true, true, true);

        // Display account details for the checking account created
        checkingAccount2.printİnfo();

        // Add the checking account to the second portfolio
        portfolio2.addAccount(checkingAccount2);

        // Display total value of the second portfolio

        // Print all account information in the second portfolio
        portfolio2.printAccountInformation();

        // Compare the first and the second portfolios
//        System.out.println("Are portfolio 1 and portfolio 2 equal: " + portfolio1.comparePortfolios(portfolio2));

        // Create a transaction for some money to be deposited
        Transaction transaction4 = new Transaction(104, 500.0, new Date(), "deposit");

        // Have the second customer deposit money to his checking account via the transaction created
        customer2.deposit(500.0, checkingAccount2);

        // Create a transaction for some money to be transferred
        Transaction transaction5 = new Transaction(105, 250.0, new Date(), "transfer");

        // Have the first customer transfer some amount from his checking account to the second customer’s checking account via the transaction created
        customer1.transfer(250.0, checkingAccount1, checkingAccount2);
    }








	}


