package PrototypePattern.Prototype2;

import PrototypePattern.Prototype1.Account;

public class AccountFactory implements Factory{

    private static Account prototype = new Account("1",1000,1000,"Ali Öztürk",true,true,true);

    @Override
    public Account create() throws CloneNotSupportedException {
        return prototype.clone();
    }

    @Override
    public Account create(String owner, double balance) throws CloneNotSupportedException {
        Account account = prototype.clone();
        account.setOwner(owner);
        account.setBalance(balance);
        return account;
    }
}
