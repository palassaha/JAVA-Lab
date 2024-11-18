// Create a class Rectangle with two instance variables:
// a. length : int
// b. width : int
// and two methods:
// i. calcArea(): int
// ii. display(): void
// Use them from main method declared in the same class.

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calcArea() {
        return length * width;
    }

    public void display() {
        System.out.println("Rectangle Details:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calcArea());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        rectangle.display();
    }
}
