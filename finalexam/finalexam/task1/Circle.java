package finalexam.task1;

public class Circle implements Drawable {
    // Properties of the circle
    private double radius;
    private double x; // x-coordinate of the circle's center
    private double y; // y-coordinate of the circle's center

    // Constructor
    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    // Getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Implementation of the draw method from the Drawable interface
    @Override
    public void Draw() {
        System.out.println("Drawing a circle at (" + x + ", " + y + ") with radius " + radius);
    }

    // Method to calculate the area of the circle
    public double area() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double circumference() {
        return 2 * Math.PI * radius;
    }
}


