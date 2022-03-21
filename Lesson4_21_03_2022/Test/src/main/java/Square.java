public class Square extends Figure {

    static {
        ANGLES = 4;
        SIDES = 4;
    }

    public Square(int numberOfAngles, int numberOfSides) {
        super(4, 4);
        if (validate(numberOfAngles, numberOfSides)) {
            this.setNumberOfAngles(numberOfAngles);
            this.setNumberOfSides(numberOfSides);

        }
    }


}
