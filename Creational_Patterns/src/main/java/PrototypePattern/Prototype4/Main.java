package PrototypePattern.Prototype4;

import PrototypePattern.Prototype1.Account;

public class Main {
    /**
     * Prototype'ların Abstract Factory Pattern ile kullanımına örnektir.
     * AccountFactory class'ında yeni bir inner class oluşturarak static prototype'ları bu class içinde tanımlarız.
     * Kullanım olarak bu da olabilir. Çoklu prototype'larda sınıftan biraz daha soyutlamak için kullanılır.
     * Enum'lar içinde de tutulabilir.
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
