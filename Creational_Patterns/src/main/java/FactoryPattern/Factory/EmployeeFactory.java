package FactoryPattern.Factory;

public class EmployeeFactory implements Factory{
    @Override
    public Employee create() {
        return new Employee("Onur Özcan");
    }
}
