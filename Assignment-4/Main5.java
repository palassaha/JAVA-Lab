interface Speaker {
    void speak();
}

class Lecturer implements Speaker {
    public void speak() {
        System.out.println("The lecturer is giving a lecture.");
    }
}

class Politician implements Speaker {
    public void speak() {
        System.out.println("The politician is giving a speech.");
    }
}

public class Main5 {
    public static void main(String[] args) {
        Speaker speaking;
        speaking = new Lecturer();
        speaking.speak();
        speaking = new Politician();
        speaking.speak();
    }
}
