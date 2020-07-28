public class Square extends GeometricFigure {
    private double sideLenth;

    public Square(double sideLenth, String colorOfSquare) {
        this.sideLenth = sideLenth;
        color = colorOfSquare;
    }

    public void draw() {
        System.out.println("The square is drawn");
    }

    public double getArea() {
        return sideLenth * sideLenth;
    }

    public String getColor() {
        return color;
    }

    public double getSideLenth() {
        return sideLenth;
    }

    public void displayFigureData() {
        StringBuilder outputString = new StringBuilder();
        draw();
        outputString.append("Фигура: квадрат, площадь: ").append(getArea()).append("ед., сторона ");
        outputString.append(getSideLenth()).append("ед., цвет: ").append(getColor());
        System.out.println(outputString.toString());
    }
}
