package port;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        Tunnel tunnel = new Tunnel();

        ShipGenerator shipGenerator = new ShipGenerator(tunnel, 10);

        Pier pierLoader1 = new Pier(tunnel, ShipType.BREAD);
        Pier pierLoader2 = new Pier(tunnel, ShipType.BANANA);
        Pier pierLoader3 = new Pier(tunnel, ShipType.CLOTHES);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        service.execute(shipGenerator);
        service.execute(pierLoader1);
        service.execute(pierLoader2);
        service.execute(pierLoader3);
        service.shutdown();
    }
}