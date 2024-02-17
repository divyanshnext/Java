public class Circle {
    
    double radius;

    // Empty constructor -> initialize when object is created
    Circle() {
        radius = 1.0;
    }

    // Parameterized constructor
    Circle(double newRadius) {
        radius = newRadius;
    }

    // Methods
    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }

    // Main method to demonstrate accessing the Circle class
    public static void main(String[] args) {
        // Creating an object for the class Circle
        Circle circle1 = new Circle();

        // Accessing the radius field of circle1
        System.out.println("circle1 - radius: " + circle1.radius);
    }
}

