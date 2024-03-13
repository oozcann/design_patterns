package FactoryPattern.FactorySecond.impl;

import FactoryPattern.Factory.Manager;
import FactoryPattern.FactorySecond.factory.ManagerFactory;

public class ManagerFactoryImpl implements ManagerFactory {
    @Override
    public Manager create(String name, String department) {
        return new Manager(name,department);
    }
}
