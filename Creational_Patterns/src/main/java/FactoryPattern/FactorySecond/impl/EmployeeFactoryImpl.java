package FactoryPattern.FactorySecond.impl;

import FactoryPattern.Factory.Employee;
import FactoryPattern.FactorySecond.factory.EmployeeFactory;

public class EmployeeFactoryImpl implements EmployeeFactory {
    @Override
    public Employee create(String name) {
        return new Employee(name);
    }
}
