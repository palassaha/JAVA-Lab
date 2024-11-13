import java.util.*;

abstract class Shape {
    public abstract void calcArea();
}

class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int radius = sc.nextInt();
        
        Circle cir = new Circle(radius);
        cir.calcArea();

        sc.close();
    }
}
