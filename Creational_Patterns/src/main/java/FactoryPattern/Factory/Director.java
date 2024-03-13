package FactoryPattern.Factory;

public class Director extends Manager{
    private int salary;

    public Director(String fullName, String department,int salary) {
        super(fullName, department);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return super.toString() + "\nMaaş: " + getSalary();
    }
}
