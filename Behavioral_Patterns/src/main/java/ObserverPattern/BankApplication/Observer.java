package ObserverPattern.BankApplication;

public interface Observer<E extends Entity> {
    void update(E entity);
}
