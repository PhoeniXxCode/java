public class Triangle {
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    // Constructor
    public Triangle(double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree) {
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    // Method to calculate area
    public double findArea() {
        return (this.base * this.height) / 2;
    }

    // Main method to run the code
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 5, 10, 6, 8);
        System.out.println("Area of triangle: " + triangle.findArea());
    }
}
