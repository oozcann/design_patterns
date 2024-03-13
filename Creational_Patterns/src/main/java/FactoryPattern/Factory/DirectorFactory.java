package FactoryPattern.Factory;

public class DirectorFactory implements Factory{
    @Override
    public Director create() {
        return new Director("Ahmet Yılmaz","Bilgi İşlem",10000);
    }
}
