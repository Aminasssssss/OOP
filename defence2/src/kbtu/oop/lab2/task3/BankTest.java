package kbtu.oop.lab2.task3;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        
        Account acc1 = new Account(1001);
        SavingsAccount savings_acc2 = new SavingsAccount(2001, 5.0);
        CheckingAccount checking_acc3 = new CheckingAccount(3001);
        
        bank.openAccount(acc1);
        bank.openAccount(savings_acc2);
        bank.openAccount(checking_acc3);
        
        System.out.println("transactions:");
        acc1.deposit(1000);
        acc1.withdraw(200);
        
        savings_acc2.deposit(5000);
        
        checking_acc3.deposit(1000);
        checking_acc3.deposit(200);
        checking_acc3.deposit(300);
        checking_acc3.withdraw(100);
        checking_acc3.deposit(50);
        
        System.out.println("\nafter transactions:");
        bank.printAllAccounts();

        System.out.println("\nupdating (interest/fees):");
        bank.update();

        System.out.println("\nafter update:");
        bank.printAllAccounts();

        System.out.println("\nclosing account 1001:");
        bank.closeAccount(1001);
        
        System.out.println("\nafter closing:");
        bank.printAllAccounts();
    }
}
