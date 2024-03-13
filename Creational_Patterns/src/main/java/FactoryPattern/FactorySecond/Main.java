package FactoryPattern.FactorySecond;

import FactoryPattern.FactorySecond.factory.DirectorFactory;
import FactoryPattern.FactorySecond.factory.EmployeeFactory;
import FactoryPattern.FactorySecond.factory.ManagerFactory;
import FactoryPattern.FactorySecond.impl.DirectorFactoryImpl;
import FactoryPattern.FactorySecond.impl.EmployeeFactoryImpl;
import FactoryPattern.FactorySecond.impl.ManagerFactoryImpl;

public class Main {
    public static void main (String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactoryImpl();
        System.out.println(employeeFactory.create("Onur Özcan").toString());

        ManagerFactory managerFactory = new ManagerFactoryImpl();
        System.out.println(managerFactory.create("Ali Yılma","İnsan Kaynakları"));

        DirectorFactory directorFactory = new DirectorFactoryImpl();
        System.out.println(directorFactory.create("Ahmet Yılmaz","Bilgi İşlem",15000));

    }
}
