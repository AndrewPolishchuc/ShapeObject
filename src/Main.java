public class Main {
    public static void main(String[] args) {
        int numberOfCircleCreate = (int) (Math.random() * 7); //Creates from zero to seven objects Circle class
        Circle[] circle = new Circle[numberOfCircleCreate];
        for (int i = 0; i < numberOfCircleCreate; i++) {
            circle[i] = new Circle(Math.random() * 100, randomColor());
            circle[i].displayFigureData();
        }
        int numberOfSquareCreate = (int) (Math.random() * 7); //Creates from zero to seven objects Square class
        Square[] square = new Square[numberOfSquareCreate];
        for (int i = 0; i < numberOfSquareCreate; i++) {
            square[i] = new Square(Math.random() * 100, randomColor());
            square[i].displayFigureData();
        }
        int numberOfTrapezoidCreate = (int) (Math.random() * 7); //Creates from zero to seven objects Trapezoid class
        Trapezoid[] trapezoids = new Trapezoid[numberOfTrapezoidCreate];
        for (int i = 0; i < numberOfTrapezoidCreate; i++) {
            trapezoids[i] = new Trapezoid(Math.random() * 100,100 + Math.random() * 100,
                    Math.random() * 100, randomColor());
            trapezoids[i].displayFigureData();
        }
        int numberOfTriangleCreate = (int) (Math.random() * 7); //Creates from zero to seven Triangle class
        Triangle[] triangles = new Triangle[numberOfTriangleCreate];
        for (int i = 0; i < numberOfTriangleCreate; i++) {
            triangles[i] = new Triangle(Math.random() * 10, Math.random() * 10, Math.random() * 10, randomColor());
            triangles[i].displayFigureData();
        }
    }
    public static String randomColor() {
        int randomValue = (int)(Math.random() * 100);
        if (0 <= randomValue && randomValue < 25) {
            return "red";
        }
        if (25 <= randomValue && randomValue < 50) {
            return "blue";
        }
        if (50 <= randomValue && randomValue < 75) {
            return "white";
        }
        if (75 <= randomValue && randomValue < 100) {
            return  "black";
        }
        return null;
    }
}
