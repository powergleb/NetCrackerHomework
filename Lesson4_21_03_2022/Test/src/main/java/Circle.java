public class Circle extends Figure{
    public Circle(int NumberOfAngles, int numberOfSides) {
        super(0,0);
    }

    @Override
    public boolean validate(Integer side, Integer angle) {
        System.out.println("Circle validation");

        return true;

    }
}
