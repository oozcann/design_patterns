package FactoryPattern.Factory;

public class Employee {
    private String fullName;
    public Employee (String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "***Çalışan Bilgileri***\nAd : " + getFullName();
    }
}
