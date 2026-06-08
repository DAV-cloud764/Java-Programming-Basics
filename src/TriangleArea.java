public class TriangleArea {
    double base;
    double height;

    // Constructor method
    public TriangleArea(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Return method
    public double calculateArea() {
        return 0.5 * base * height;
    }

    // Void method
    public void displayArea() {
        double area = calculateArea();
        System.out.println("The area of the triangle is: " + area);
    }

    // Main method
    public static void main(String[] args) {
        TriangleArea triangle = new TriangleArea(10.0, 5.0);
        
        triangle.displayArea();
        
        double area = triangle.calculateArea();
        System.out.println("Area returned: " + area);
    }
}