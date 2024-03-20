package PrototypePattern.Prototype3;

import PrototypePattern.Prototype1.Account;

public class AccountFactory implements Factory {

    private static Account normalPrototype = new Account("1",1000,1000,"Ali Öztürk",true,true,true);
    private static Account negativePrototype = new Account("2",0,1000,"Ali Öztürk",true,true,false);
    private static Account frozenPrototype = new Account("3",-1000,1000,"Ali Öztürk",false,false,false);



    @Override
    public Account createNormalAccount() {
        return normalPrototype.clone();
    }

    @Override
    public Account createNormalAccount(String owner, double balance) {
        Account account = normalPrototype.clone();
        account.setOwner(owner);
        account.setBalance(balance);
        return account;
    }

    @Override
    public Account createNegativeAccount(String owner, double balance) {
        Account account = negativePrototype.clone();
        account.setOwner(owner);
        account.setBalance(balance);
        return account;
    }

    @Override
    public Account createFrozenAccount(String owner, double balance) {
        Account account = frozenPrototype.clone();
        account.setOwner(owner);
        account.setBalance(balance);
        return account;
    }
}
