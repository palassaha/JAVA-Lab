// Create a class Complex and implement add(), subtract() and isequal()
// operation. (Use ‘this’ keyword )

public class Complex {
    private double real;
    private double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }

    public boolean isequal(Complex other) {
        return this.real == other.real && this.imag == other.imag;
    }

    public void display() {
        System.out.println(this.real + " + " + this.imag + "i");
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(3.0, 4.0);
        Complex c2 = new Complex(1.0, 2.0);

        Complex sum = c1.add(c2);
        System.out.print("Sum: ");
        sum.display();

        Complex difference = c1.subtract(c2);
        System.out.print("Difference: ");
        difference.display();

        System.out.println("Are c1 and c2 equal? " + c1.isequal(c2));
    }
}
