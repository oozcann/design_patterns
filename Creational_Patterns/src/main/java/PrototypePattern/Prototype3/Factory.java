package PrototypePattern.Prototype3;

import PrototypePattern.Prototype1.Account;

public interface Factory {
    Account createNormalAccount();
    Account createNormalAccount(String owner,double balance);
    Account createNegativeAccount(String owner,double balance);
    Account createFrozenAccount(String owner,double balance);
}
