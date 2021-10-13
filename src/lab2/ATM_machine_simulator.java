package lab2;

public class ATM_machine_simulator extends Thread {
    public static void main(String[] args) {
        // Create an Account object and initialize its balance to 1000.
        Account account = new Account();
        account.setBalance(1000);
//        account.addAmount(100);
//        account.subtractAmount(500);
//        account.addAmount(100);

        
//        account.subtractAmount(100.00);
//        account.addAmount(0);

        // Create a Company object and Thread to run it.
        Runnable companyX = new Company(account);// created object for company and started thread
        Thread companyX1 = new Thread(companyX) ;
        
        
        // Create a Bank object and Thread to run it.
        Runnable BankX = new Bank(account);// created object for bank and started thread
        Thread BankX1 = new Thread(BankX) ;
        

        // Write the initial balance to the console.
        System.out.printf("Account : Start Balance: %f\n", account.getBalance());

        // Start the threads.
//        IncrementThread[] threads = new IncrementThread[5];
        companyX1.start();
        BankX1.start();
        

//        account.getBalance();
        



//Wait for the finalization of the two threads using the join() method and print in the console the final balance of the account.

        try {
        	companyX1.join();
        	BankX1.join();
        	}
        catch(Exception e){
        	e.printStackTrace();
        }
  
    System.out.printf("Account : Final Balance: %f\n", account.getBalance());

}
}



