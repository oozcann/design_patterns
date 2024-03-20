package PrototypePattern.Prototype2;

import PrototypePattern.Prototype1.Account;

public interface Factory {
    Account create() throws CloneNotSupportedException;
    Account create(String owner,double balance) throws CloneNotSupportedException;
}
