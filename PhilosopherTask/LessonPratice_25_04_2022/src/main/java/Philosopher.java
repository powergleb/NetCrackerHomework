

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicBoolean;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Philosopher implements Runnable {
    private int id;
    private Fork left;
    private Fork right;
    private StatePhilo statePhilo;
    final AtomicBoolean stopper = new AtomicBoolean();


    @Override
    public void run() {
        while (!stopper.get()) {
            think();
            //takeForks();
            eat();
            //putForks();
        }
    }

    void think() {
        System.out.println(getId() + " философ думает");
    }

    void eat() {
        System.out.println(getId() + " философ eating)");
    }
}
