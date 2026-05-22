package bridgeLabz_Practice;
class Human {

    void eat() {
        System.out.println("Human is eating");
    }

    void sleep() {
        System.out.println("Human is sleeping");
    }
}

class Student1 extends Human {

    void study() {
        System.out.println("Student is studying");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Student1 s = new Student1();

        s.eat();
        s.sleep();

        s.study();
    }
}