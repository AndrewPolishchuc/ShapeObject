public class Trapezoid extends GeometricFigure {
    private double lengthOfLargerBase;
    private double lesserBaseLength;
    private double trapezoidHeight;

    public Trapezoid( double lengthOfLargerBase, double lesserBaseLength, double trapezoidHeight,
                      String color) {
        this.lengthOfLargerBase = lengthOfLargerBase;
        this.lesserBaseLength = lesserBaseLength;
        this.trapezoidHeight = trapezoidHeight;
        this.color = color;
    }

    public void draw() {
        System.out.println("The trapezoid is drawn");
    }

    public double getArea() {
        return (1 / 2) * (lesserBaseLength + lengthOfLargerBase) * trapezoidHeight;
    }

    public String getColor() {
        return color;
    }

    public double getHeight() {
        return trapezoidHeight;
    }

    public void displayFigureData() {
        StringBuilder outputString = new StringBuilder();
        draw();
        outputString.append("трапеция, площадь: ").append(getArea()).append("ед., высота ");
        outputString.append(getHeight()).append("ед., цвет: ").append(getColor());
        System.out.println(outputString.toString());
    }
}
