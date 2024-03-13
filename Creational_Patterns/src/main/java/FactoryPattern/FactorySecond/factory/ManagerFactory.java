package FactoryPattern.FactorySecond.factory;

import FactoryPattern.Factory.Manager;

public interface ManagerFactory {
    public Manager create(String name,String department);
}
