package port;

import java.util.*;

public class Tunnel {

    private List<Ship> store;
    private static final int maxShipsInTunel = 5;
    private static final int minShipsInTunel = 0;
    private int shipsCounter = 0;

    public Tunnel() {
        store = new ArrayList<>();
    }

    public synchronized boolean add(Ship element) {
        try {
            if (shipsCounter < maxShipsInTunel) {
                notifyAll();
                store.add(element);
                String info = String.format("%s + Корабль прибыл в туннель: %s %s %s", store.size(), element.getTypeShip(), element.getSizeShip(), Thread.currentThread().getName());
                System.out.println(info);
                shipsCounter++;

            } else {
                System.out.println(store.size() + "> В туннеле нет места для корабля: " + Thread.currentThread().getName());
                wait();
                return false;
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }

    public synchronized Ship get(ShipType shipType) {

        try {
            if (shipsCounter > minShipsInTunel) {
                notifyAll();
                for (Ship ship : store) {
                    if (ship.getTypeShip() == shipType) {
                        shipsCounter--;
                        System.out.println(store.size() + "- Корабль выводят из туннеля: " + Thread.currentThread().getName());
                        store.remove(ship);
                        return ship;
                    }
                }
            }

            System.out.println("0 < В туннеле нет кораблей");
            wait();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}