package kbtu.oop.lab2.task3;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;
    
    public Bank() {
        accounts = new Vector<Account>();
    }
    
    public void openAccount(Account account) {
        accounts.add(account);
    }
    
    public void closeAccount(int accNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber() == accNumber) {
                accounts.remove(i);
                return;
            }
        }
    }
    
    public void update() {
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            
            if (account instanceof SavingsAccount) {
                SavingsAccount s = (SavingsAccount) account;
                s.addInterest();
            }
            if (account instanceof CheckingAccount) {
                CheckingAccount c = (CheckingAccount) account;
                c.deductFee();
            }
        }
    }
    
    public void printAllAccounts() {
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println(accounts.get(i));
        }
    }
}
