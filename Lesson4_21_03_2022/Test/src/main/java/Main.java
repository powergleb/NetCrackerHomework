public class Main {
    public static void main(String[] args) {

        Figure triangle = new Triangle(3,3);
        triangle.draw();

        Figure square = new Square(4,4);
        square.draw();


        Figure circle = new Circle(333,333);
        circle.draw();

        Picture pic = new Picture();

        pic.addFigure(triangle);
        pic.addFigure(square);
        pic.addFigure(circle);

        pic.draw();
        pic.erase();
    }
}
