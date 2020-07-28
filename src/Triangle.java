public class Triangle extends GeometricFigure{
    private double sideLength1;
    private double sideLength2;
    private double sideLength3;

    public Triangle(double sideLength1, double sideLength2, double sideLength3, String colorOfSquare) {
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
        this.sideLength3 = sideLength3;
        color = colorOfSquare;
    }

    public void draw() {
        System.out.println("The triangle is drawn");
    }

    public double getArea() {
        double perimeter = sideLength1 + sideLength2 + sideLength3;
        return Math.sqrt(perimeter * (perimeter - sideLength1) * (perimeter - sideLength2)
                * (perimeter - sideLength3));
    }

    public String getColor() {
        return color;
    }

    public String seeSideLengths() {
        return Double.toString(sideLength1) + " " + Double.toString(sideLength2)
                + " " + Double.toString(sideLength3);
    }

    public void displayFigureData() {
        StringBuilder outputString = new StringBuilder();
        draw();
        outputString.append("треугольник, площадь: ").append(getArea()).append("ед., со сторонами ");
        outputString.append(seeSideLengths()).append(", цвет: ").append(getColor());
        System.out.println(outputString.toString());
    }
}
