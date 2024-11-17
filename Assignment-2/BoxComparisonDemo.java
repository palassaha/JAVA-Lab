// Create a class Box with three instance variables:
// a. width : int
// b. height : int
// c. depth : int
// and three methods:
// i. volume(): double
// ii. display(): void
// iii. compareVolume( Box, Box): Box

// Create three instances of Box class and display the details of the object
// with highest volume.

class Box {
    private int width;
    private int height;
    private int depth;

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double volume() {
        return width * height * depth;
    }

    public void display() {
        System.out.println("Box Dimensions (Width x Height x Depth): " + width + " x " + height + " x " + depth);
        System.out.println("Volume: " + volume());
    }

    public Box compareVolume(Box otherBox) {
        return (this.volume() > otherBox.volume()) ? this : otherBox;
    }
}

public class BoxComparisonDemo {
    public static void main(String[] args) {

        Box box1 = new Box(3, 4, 5); // Volume: 60
        Box box2 = new Box(6, 7, 8); // Volume: 336
        Box box3 = new Box(2, 2, 2); // Volume: 8

        Box largestBox = box1.compareVolume(box2).compareVolume(box3);

        System.out.println("The box with the highest volume is:");
        largestBox.display();
    }
}