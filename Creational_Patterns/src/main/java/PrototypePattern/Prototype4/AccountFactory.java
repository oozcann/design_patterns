package PrototypePattern.Prototype4;

import PrototypePattern.Prototype1.Account;

public class AccountFactory implements Factory {

    @Override
    public Account createNormalAccount() {
        return AccountPrototypes.normalPrototype.clone();
    }

    @Override
    public Account createNormalAccount(String owner, double balance) {
        Account account = AccountPrototypes.normalPrototype.clone();
        account.setOwner(owner);
        account.setBalance(balance);
        return account;
    }

    @Override
    public Account createNegativeAccount(String owner, double balance) {
        Account account = AccountPrototypes.negativePrototype.clone();
        account.setOwner(owner);
        account.setBalance(balance);
        return account;
    }

    @Override
    public Account createFrozenAccount(String owner, double balance) {
        Account account = AccountPrototypes.frozenPrototype.clone();
        account.setOwner(owner);
        account.setBalance(balance);
        return account;
    }
    static class AccountPrototypes {
        static Account normalPrototype = new Account("1",1000,1000,"Ali Öztürk",true,true,true);
        static Account negativePrototype = new Account("2",0,1000,"Ali Öztürk",true,true,false);
        static Account frozenPrototype = new Account("3",-1000,1000,"Ali Öztürk",false,false,false);

    }
}
