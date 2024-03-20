package PrototypePattern.Prototype1;

public class Main {
    public static void main (String[] args) throws CloneNotSupportedException {
        // Normal Account için prototype  bir instance oluşturulur.

        Account normalAccountPrototype = new Account("1",1000,1000,"Ali Öztürk",true,true,true);

        // Normal Account
        Account normalAccount = normalAccountPrototype.clone();
        normalAccount.setIban("2");
        normalAccount.setBalance(2000);

        System.out.println(normalAccount.toString());

        // Negative Account

        Account negativeAccount = normalAccountPrototype.clone();
        negativeAccount.setBalance(-600);
        negativeAccount.setOwner("Mustafa Yılmaz");
        negativeAccount.setOpenToPayment(false);
        negativeAccount.setOpenToTransfer(false);

        System.out.println(negativeAccount.toString());

        // Frozen Account

        Account frozenAccount = normalAccountPrototype.clone();
        frozenAccount.setBalance(-1000);
        frozenAccount.setCredit(-1000);
        frozenAccount.setOwner("Ali Bayram");
        frozenAccount.setOpenToTransfer(false);
        frozenAccount.setOpenToWithdraw(false);
        frozenAccount.setOpenToPayment(false);

        System.out.println(frozenAccount.toString());


    }
}
