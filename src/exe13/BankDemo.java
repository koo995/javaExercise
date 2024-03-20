package src.exe13;

import java.util.Arrays;

class SynchBank {
    private final double[] accounts;

    public SynchBank(int n, double initialBalance) {
        accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
    }

    public synchronized void transfer(int from, int to, double amount) throws InterruptedException {
        while (accounts[from] < amount)
            wait();
        String str = Thread.currentThread().getName();
        accounts[from] -= amount;
        str = str + String.format(" %10.2f from %d to %d", amount, from, to);
        accounts[to] += amount;
        str = str + String.format(" Total Balance: %10.2f", getTotalBalance());
        System.out.println(str);
        notifyAll();
    }

    public synchronized double getTotalBalance() {
        double sum = 0;
        for (double a : accounts)
            sum += a;
        return sum;
    }

    public int size() {
        return accounts.length;
    }
}

class UnsynchBank {
    private final double[] accounts;
    public UnsynchBank(int n, double initialBalance) {
        accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
    }
    public void transfer(int from, int to, double amount) {
        if (accounts[from] < amount) return;
        String str = Thread.currentThread().getName();
        accounts[from] -= amount;
        str = str + String.format(" %10.2f from %d to %d", amount, from, to);
        accounts[to] += amount;
        str = str + String.format(" Total Balance: %10.2f", getTotalBalance());
        System.out.println(str);
    }
    public double getTotalBalance() {
        double sum = 0;
        for (double a : accounts)
            sum += a;
        return sum;
    }
    public int size() {
        return accounts.length;
    }
}



public class BankDemo {
    public static final int NACCOUNTS = 100;
    public static final double INITIAL_BALANCE = 1000;
    public static final double MAX_AMOUNT = 1000;
    public static final int DELAY = 10;
    public static void main(String[] args) {
        SynchBank bank = new SynchBank(NACCOUNTS, INITIAL_BALANCE);
        for (int i = 0; i < NACCOUNTS; i++) {
            int fromAccount = i;
            Thread t = new Thread(new Runnable() {
                public void run() {
                    try {
                        while (true) {
                            int toAccount = (int) (bank.size() * Math.random());
                            double amount = MAX_AMOUNT * Math.random();
                            bank.transfer(fromAccount, toAccount, amount);
                            Thread.sleep((int) (DELAY * Math.random()));
                        }
                    } catch (InterruptedException e) { }
                }
            });
            t.start();
        }
    }
}