// Design a TestScores class that has fields to hold three test scores. The
// class should have accessor and mutator methods for the test score fields,
// and a method that returns the average of the test scores. Demonstrate the
// class by writing a separate program that creates an instance of the class.
// The program should ask the user to enter three test scores, which are
// stored in the TestScores object. Then the program should display the
// average of scores, as reported by the TestScores object.

import java.util.Scanner;

class TestScores {
    private double score1;
    private double score2;
    private double score3;

    public TestScores(double score1, double score2, double score3) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    public double getScore1() {
        return score1;
    }

    public double getScore2() {
        return score2;
    }

    public double getScore3() {
        return score3;
    }

    public void setScore1(double score1) {
        this.score1 = score1;
    }

    public void setScore2(double score2) {
        this.score2 = score2;
    }

    public void setScore3(double score3) {
        this.score3 = score3;
    }

    public double getAverage() {
        return (score1 + score2 + score3) / 3;
    }
}

public class TestScoresDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first test score: ");
        double score1 = scanner.nextDouble();

        System.out.print("Enter second test score: ");
        double score2 = scanner.nextDouble();

        System.out.print("Enter third test score: ");
        double score3 = scanner.nextDouble();

        TestScores testScores = new TestScores(score1, score2, score3);

        System.out.printf("The average of the scores is: %.2f%n", testScores.getAverage());
        scanner.close();
    }
}
