// Write a Java program to convert double value to String.

public class DoubleToString {
    public static void main(String[] args) {
        double doubleValue = 123.456;
        String stringValue = String.valueOf(doubleValue);
        System.out.println("The double value as a String is: " + stringValue);
        String stringValueAlternative = Double.toString(doubleValue);
        System.out.println("The double value as a String (alternative) is: " + stringValueAlternative);
    }
}
