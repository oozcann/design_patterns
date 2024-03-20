package PrototypePattern.Prototype3;

import PrototypePattern.Prototype1.Account;

public class Main {
    /**
     * Prototype'ların Abstract Factory Pattern ile kullanımına örnektir.
     * Factory'de 3 farklı prototype oluşturulur: normal, negative ve frozen.
     * istemcide set işlemleri yapılmadan (ya da çok azaltılarak) istenen durum instance'ı oluşturulmuş olur.
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Factory factory = new AccountFactory();

        Account normalAccount = factory.createNormalAccount("Ahmet Taylan",2000);
        System.out.println(normalAccount.toString());

        Account negativeAccount = factory.createNegativeAccount("Ali Veli", -100);
        System.out.println(negativeAccount.toString());

        Account frozenAccount = factory.createFrozenAccount("Ayşe Fatma", -1000);
        System.out.println(frozenAccount.toString());
    }
}
