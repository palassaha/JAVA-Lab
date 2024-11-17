// Create a class Person having name and age of a Person as data members.
// Write a method that compare two persons by their age and print the
// person’s name and age who is senior most.

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person compareAge(Person otherPerson) {
        return (this.age > otherPerson.age) ? this : otherPerson;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


public class PersonComparisonDemo {
    public static void main(String[] args) {

        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 45);

        Person seniorMost = person1.compareAge(person2);

        System.out.println("The senior-most person is:");
        seniorMost.display();
    }
}
