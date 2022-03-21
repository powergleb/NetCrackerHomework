import java.util.ArrayList;


public class Picture implements Shape{
    private ArrayList<Shape> figures = new ArrayList<Shape>();

    public Picture(ArrayList<Shape> figures) {
        this.figures = figures;
    }
    public Picture() {
    }

    @Override
    public void draw() {
        for(Shape figure : figures){
            figure.draw();
        }
    }

    @Override
    public void erase() {
        for(Shape figure : figures){
            figure.erase();
        }
    }

    @Override
    public boolean validate(Integer side, Integer angle) {
        return false;
    }

    public void addFigure(Figure fig){

        this.figures.add(fig);
    }
    public void removeFigure(Figure fig){
        this.figures.remove(fig);
    }

    public ArrayList<Shape> getFigures() {
        return figures;
    }

    public void setFigures(ArrayList<Shape> figures) {
        this.figures = figures;
    }
}
