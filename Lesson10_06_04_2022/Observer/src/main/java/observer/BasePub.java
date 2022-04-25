package observer;

public interface BasePub {

    void Subscribe(BaseSub subscriber);

    void Unsubscribe(BaseSub subscriber);

    void Notify();
}
