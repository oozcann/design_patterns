package FactoryPattern.FactorySecond.impl;

import FactoryPattern.Factory.Director;
import FactoryPattern.FactorySecond.factory.DirectorFactory;

public class DirectorFactoryImpl implements DirectorFactory {
    @Override
    public Director create(String name, String department, int salary) {
        return new Director(name,department,salary);
    }
}
