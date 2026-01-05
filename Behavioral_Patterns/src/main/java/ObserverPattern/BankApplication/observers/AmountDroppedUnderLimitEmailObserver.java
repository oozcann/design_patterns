package ObserverPattern.BankApplication.observers;

import ObserverPattern.BankApplication.BankAccount;
import ObserverPattern.BankApplication.Observer;

public class AmountDroppedUnderLimitEmailObserver implements Observer<BankAccount> {
    @Override
    public void update(BankAccount bankAccount) {
        if (bankAccount.isAmountUnderLimit()) {
            System.out.println("SMS: Hesabınızın bakiyesi belirlenen limitin altına düştü.");
        }
    }
}
