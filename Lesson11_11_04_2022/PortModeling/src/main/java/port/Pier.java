package port;

public class Pier implements Runnable {
    private Tunnel tunnel;
    private ShipType shipType;

    public Pier(Tunnel tunnel, ShipType shipType) {
        this.tunnel = tunnel;
        this.shipType = shipType;
    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.currentThread().setName("тип корабля " + shipType);

                //Time to load the goods
                Thread.sleep(500);
                Ship ship = tunnel.get(shipType);
                if (ship != null)
                    while (ship.countCheck()) {
                        Thread.sleep(100);
                        ship.add(10);
                        System.out.println(ship.getCount() + " Загружен корабль. " + Thread.currentThread().getName());
                    }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}