package lab2;

public class ATM_machine_simulator {
    public static void main(String[] args) {
        // Create an Account object and initialize its balance to 1000.
        Account account = new Account();
        account.setBalance(1000);

        // Create a Company object and Thread to run it.
        UnsafeCounter c = new UnsafeCounter(0);

        // Create a Bank object and Thread to run it.


        // Write the initial balance to the console.
        System.out.printf("Account : Start Balance: %f\n", account.getBalance());

        // Start the threads.
        IncrementThread[] threads = new IncrementThread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new IncrementThread(c);
        }
        for (IncrementThread t: threads) {
            t.start();
        }

        for (IncrementThread t: threads) {
            try {
                t.join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Account : Final Balance: " + c.getValue());

    }
}

//Wait for the finalization of the two threads using the join() method and print in the console the final balance of the account.

class IncrementThread extends Thread {
    UnsafeCounter c;

    IncrementThread(UnsafeCounter c) {
        this.c = c;
    }

    public void run() {
        c.increment();
    }



}