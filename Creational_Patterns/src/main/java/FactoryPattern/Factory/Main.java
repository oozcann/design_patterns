package FactoryPattern.Factory;

public class Main {
    public static void main (String[] args) {
        Factory employeeFactory = new EmployeeFactory();
        System.out.println(employeeFactory.create().toString());

        Factory managerFactory = new ManagerFactory();
        System.out.println(managerFactory.create().toString());

        Factory directorFactory = new DirectorFactory();
        System.out.println(directorFactory.create().toString());
    }
}
