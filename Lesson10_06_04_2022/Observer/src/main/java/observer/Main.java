package observer;

public class Main {

    public static void main(String[] args) {
        // Клиентский код.
        Publisher subject = new Publisher();
        Subscriber observerA = new Subscriber("1");
        Subscriber observerB = new Subscriber("2");
        subject.Subscribe(observerA);
        subject.Subscribe(observerB);

        subject.SomeBusinessLogic();
        subject.SomeBusinessLogic();

        subject.Unsubscribe(observerA);
        subject.SomeBusinessLogic();
    }
}
