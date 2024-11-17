// Write a program using parameterized constructors to calculate area of a
// square and a rectangle.

class Square{
    private int side;

    public Square(int side){
        this.side = side;
    }

    public int area(){
        return side * side;
    }

    public void display(){
        System.out.println("Square area: " + area());
    }
}

class Rectangle{
    private int length;
    private int breadth;


    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int area(){
        return length * breadth;
    }

    public void display(){
        System.out.println("Rectangle area: " + area());
    }
}

public class Main8 {
    public static void main(String[] args) {
        Square sq = new Square(5);
        sq.display();

        Rectangle rect = new Rectangle(10, 4);
        rect.display();
    }
}