package PrototypePattern.Prototype2;

import PrototypePattern.Prototype1.Account;

public class Main {
    /**
     * Prototype'ların Factory Pattern ile kullanımına örnektir.
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Factory factory = new AccountFactory();

        Account normalAccount = factory.create("Ahmet Taylan",2000);
        normalAccount.setIban("2");
        System.out.println(normalAccount.toString());

        Account negativeAccount = factory.create("Ali Veli", -100);
        negativeAccount.setOpenToTransfer(false);
        System.out.println(negativeAccount.toString());

        Account frozenAccount = factory.create("Ayşe Fatma", -1000);
        frozenAccount.setOpenToTransfer(false);
        frozenAccount.setOpenToWithdraw(false);
        frozenAccount.setOpenToPayment(false);
        System.out.println(frozenAccount.toString());
    }
}
