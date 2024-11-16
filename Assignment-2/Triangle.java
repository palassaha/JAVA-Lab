// Create a class Triangle with two instance variables:
// a. base: int
// b. height: int
// And two methods:
// i. area(): double
// ii. display(): void

// Use constructor to initialized the instance variables. Create an array of
// objects of type Triangle. Calculate and display the area of the object with
// highest area in main().

public class Triangle {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return 0.5 * base * height;
    }

    public void display() {
        System.out.println("Base: " + base + ", Height: " + height + ", Area: " + area());
    }

    public static void main(String[] args) {
        Triangle[] triangles = new Triangle[3];
        triangles[0] = new Triangle(10, 5);
        triangles[1] = new Triangle(8, 12);
        triangles[2] = new Triangle(15, 7);

        Triangle maxTriangle = triangles[0];
        for (Triangle triangle : triangles) {
            if (triangle.area() > maxTriangle.area()) {
                maxTriangle = triangle;
            }
        }

        System.out.print("Triangle with the maximum area: ");
        maxTriangle.display();
    }
}