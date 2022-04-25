package port;

import java.util.NoSuchElementException;

public enum ShipSize {
    SMALL(10),
    MEDIUM(50),
    BIG(100);

    private final int value;

    ShipSize(int value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    public static ShipSize withValue(float value) {

        for (ShipSize colour : values()) {


            if (colour.value == value) {
                return colour;
            }
        }

        throw new NoSuchElementException(
                "There's no ShipSize with this value " + value);
    }
}
