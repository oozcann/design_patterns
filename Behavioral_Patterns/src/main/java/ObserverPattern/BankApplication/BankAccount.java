package ObserverPattern.BankApplication;

import java.util.ArrayList;
import java.util.List;

public class BankAccount implements Entity,Observable {
    List<Observer> observers = new ArrayList<>();
    private String accountOwner;
    private double amount;
    private static int AMOUNT_LIMIT = 100;

    public BankAccount (String accountOwner, double amount) {
        this.accountOwner = accountOwner;
        this.amount = amount;
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public boolean isAmountUnderLimit () {
        return amount < AMOUNT_LIMIT;
    }

    public void withdraw (double amount) {
        if (this.amount > amount) {
            this.amount -= amount;
            System.out.println("Para çekme işlemi tamamlanmıştır. \nÇekilen Tutar: " + amount + "\nKalan Bakiye: " + this.amount);
            notifyObservers();
        } else {
            System.out.println("Bakiye yetersiz. Toplam çekilebilir tutar: " + this.amount);
        }
    }

    public void deposit (double amount) {
        this.amount += amount;
        System.out.println("Para yatırma işlemi tamamlanmıştır. \nYatırılan Tutar: " + amount + "\nToplam Bakiye: " + this.amount);
        notifyObservers();
    }

}
