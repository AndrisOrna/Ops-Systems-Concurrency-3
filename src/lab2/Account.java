package lab2;

public class Account {
    private double balance;

    public Account() {
        // TODO Auto-generated constructor stub
    }

    public double getBalance() {
    	synchronized(this) {
    		return balance;
    	}
        
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addAmount(double amount) {
    	// add something to add the amount
    	synchronized(this) {
        double tmp = balance;
        setBalance(tmp + amount); 
        
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance = tmp + amount;

    	}
    }
    public void subtractAmount(double amount) {
    	synchronized(this) {
    	double tmp = balance;
        setBalance(tmp - amount); 
        
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance = tmp - amount;
    	}
    }
}