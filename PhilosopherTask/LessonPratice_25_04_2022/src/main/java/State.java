import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;

@AllArgsConstructor
@NoArgsConstructor
public class State {
    private Philosopher[] philosophers;
    private State[] states;
    private Lock lock;


    public void putFork(int id, Fork l, Fork r){
        lock.lock();
        //setState(id,StatePhilo.THINKING);
        //l.setAvailabilyty(true);
        //r.setAvailabilyty(true);

    }

    public void takeFork(int id, Fork l, Fork r){
        lock.lock();
        //setState(id,StatePhilo.HUNGRY);
        //l.setAvailabilyty(false);
        //r.setAvailabilyty(false);
        //блокируем вилки и меняем статус на ест)

    }
}
