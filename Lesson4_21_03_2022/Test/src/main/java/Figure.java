public abstract class Figure implements Shape {

    static Integer ANGLES = 0;
    static Integer SIDES = 0;

    private int numberOfAngles;
    private int numberOfSides;

    public void draw() {
        System.out.println(this.getClass().getSimpleName() + " draw");
    }

    public void erase() {
        System.out.println(this.getClass().getSimpleName() + " erase");
    }

    public Figure(int numberOfAngles, int numberOfSides) {
        if (validate(numberOfSides,numberOfAngles)){

        }
        this.numberOfAngles = numberOfAngles;
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfAngles() {
        return numberOfAngles;
    }

    public void setNumberOfAngles(int numberOfAngles) {
        this.numberOfAngles = numberOfAngles;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    @Override
    public boolean validate(Integer side, Integer angle) {
        if (!ANGLES.equals(angle) || !SIDES.equals(side)) {
            throw new IllegalArgumentException(this.getClass().getSimpleName() + "Cannot be created with side: " + side + "and angle:" + angle);

        }return true;
        }
}
