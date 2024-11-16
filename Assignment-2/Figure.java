// Create a class named Figure. Make cube, cylinder and sphere as object of
// the class Figure and calculate their surface area using concept of
// constructor overloading.

public class Figure {
    private double side;
    private double radius;
    private double height;

    // Constructor for Cube
    public Figure(double side) {
        this.side = side;
    }

    // Constructor for Cylinder
    public Figure(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Constructor for Sphere
    public Figure(double radius, boolean isSphere) {
        this.radius = radius;
    }

    public double surfaceAreaCube() {
        return 6 * side * side;
    }

    public double surfaceAreaCylinder() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double surfaceAreaSphere() {
        return 4 * Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // Cube
        Figure cube = new Figure(5);
        System.out.println("Surface area of cube: " + cube.surfaceAreaCube());

        // Cylinder
        Figure cylinder = new Figure(3, 7);
        System.out.println("Surface area of cylinder: " + cylinder.surfaceAreaCylinder());

        // Sphere
        Figure sphere = new Figure(4, true);
        System.out.println("Surface area of Sphere: " + sphere.surfaceAreaSphere());
    }
}

