package FactoryPattern.FactorySecond.factory;

import FactoryPattern.Factory.Director;

public interface DirectorFactory {
    public Director create(String name, String department, int salary);
}
