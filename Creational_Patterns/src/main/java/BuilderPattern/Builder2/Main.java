package BuilderPattern.Builder2;

public class Main {
    /**
     * Burada computerBuilder sadece build methodunu çağırır.
     * Concrete class private methodlar ile diğer class'ların build'ini yapar.
     * Geriye yine computer dönülür.
     * @param args
     */
    public static void main(String[] args) {
        ComputerBuilder builder = new ComputerBuilderImpl();
        builder.build().start();
    }
}
