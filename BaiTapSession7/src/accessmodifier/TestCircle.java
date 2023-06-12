package accessmodifier;


public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();

        // Accessing getRadius() and getArea() methods
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());

        // Changing access modifier for getRadius() and getArea() methods
        // Private to public
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
    }
}