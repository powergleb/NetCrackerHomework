package port;

import java.util.Random;

public class ShipGenerator implements Runnable {

    private Tunnel tunnel;
    private int shipCount;

    public ShipGenerator(Tunnel tunnel, int shipCount) {
        this.tunnel = tunnel;
        this.shipCount = shipCount;
    }

    @Override
    public void run() {
        int count = 0;
        while (count < shipCount) {
            Thread.currentThread().setName("Генератор кораблей");
            count++;
            tunnel.add(new Ship(getRandomSize(), getRandomType()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private ShipType getRandomType() {
        Random random = new Random();
        return ShipType.values()[random.nextInt(ShipType.values().length)];
    }

    private ShipSize getRandomSize() {
        Random random = new Random();
        return ShipSize.values()[random.nextInt(ShipSize.values().length)];
    }
}