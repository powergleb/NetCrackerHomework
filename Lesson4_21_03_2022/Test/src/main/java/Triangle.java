public class Triangle extends Figure {
    static {
        ANGLES = 3;
        SIDES = 3;
    }
    public Triangle(int numberOfAngles, int numberOfSides) {
        super(3, 3);
        if (validate(numberOfAngles,numberOfSides)){
            this.setNumberOfAngles(numberOfAngles);
            this.setNumberOfSides(numberOfSides);

        }
    }

}
