public class Rectangle {
    
    double length;
    double width;

    // constructor
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    // method to calculate area
    public double calculateArea(){
        return length * width;
    }

    // method to calculate perimeter
    public double calculatePerimeter(){
        return 2 * (length + width);
    }

    public void displayInfo(){
        double area = calculateArea();
        System.out.println("The Area of Rectangle is: " + area);
        double perimeter = calculatePerimeter();
        System.out.println("The Perimeter is: " + perimeter);
    }

    public static void main(String[] args){
        Rectangle A = new Rectangle(10.0, 15.0);
        A.displayInfo();

        
        
    }

    
}
