package observer;

import java.util.ArrayList;
import java.util.Random;

public class Publisher implements BasePub{
    // Для удобства в этой переменной хранится состояние Издателя,
    // необходимое всем подписчикам.
    public int State = -0;

    private ArrayList<BaseSub> subList = new ArrayList<BaseSub>();

    public int getState() {
        return State;
    }

    public void setState(int state) {
        State = state;
    }

    @Override
    public void Subscribe(BaseSub subscriber) {
        System.out.println("Publisher: add an subscriber.");
        this.subList.add(subscriber);
    }

    @Override
    public void Unsubscribe(BaseSub subscriber) {
        System.out.println("Publisher: remove an subscriber.");
        this.subList.remove(subscriber);
    }

    @Override
    public void Notify() {
        System.out.println("Publisher: Notifying subs...");

        subList.stream().forEach(x->x.Update(this));
    }


    public void SomeBusinessLogic()
    {
        System.out.println("Publisher: I'm doing something important.");
        this.State = new Random().nextInt(10);

        System.out.println("Publisher: My state has just changed to: " + this.State);
        this.Notify();
    }
}