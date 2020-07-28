public class Circle extends GeometricFigure {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void draw() {
        System.out.println("The circle is drawn");
    }

    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void displayFigureData() {
        StringBuilder outputString = new StringBuilder();
        draw();
        outputString.append("круг, площадь: ").append(getArea()).append("ед., радиусом ");
        outputString.append(getRadius()).append("ед., цвет: ").append(getColor());
        System.out.println(outputString.toString());
    }
}
