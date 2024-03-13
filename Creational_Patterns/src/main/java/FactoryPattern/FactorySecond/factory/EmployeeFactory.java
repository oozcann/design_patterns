package FactoryPattern.FactorySecond.factory;

import FactoryPattern.Factory.Employee;

public interface EmployeeFactory {
    public Employee create(String name);
}
