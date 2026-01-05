package ObserverPattern.BankApplication;

import ObserverPattern.BankApplication.observers.AmountDroppedUnderLimitEmailObserver;
import ObserverPattern.BankApplication.observers.AmountDroppedUnderLimitSmsObserver;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Onur Özcan",500);

        bankAccount.addObserver(new AmountDroppedUnderLimitEmailObserver());
        bankAccount.addObserver(new AmountDroppedUnderLimitSmsObserver());

        bankAccount.withdraw(450);
        bankAccount.withdraw(100);
        bankAccount.deposit(600);
        bankAccount.withdraw(250);
        bankAccount.withdraw(350);



    }
}
