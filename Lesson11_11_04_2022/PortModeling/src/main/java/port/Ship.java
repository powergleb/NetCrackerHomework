package port;

public class Ship {
    private int count;
    private ShipSize shipSize;
    private ShipType shipType;

    public Ship(ShipSize shipSize, ShipType shipType) {
        this.shipSize = shipSize;
        this.shipType = shipType;
    }

    public void add(int count) {
        this.count += count;
    }

    public boolean countCheck() {
        if (count >= shipSize.getValue()) {
            return false;
        }
        return true;
    }

    public int getCount() {
        return count;
    }

    public ShipType getTypeShip() {
        return shipType;
    }

    public ShipSize getSizeShip() {
        return shipSize;
    }
}