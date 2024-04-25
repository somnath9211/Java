package OOPS;

public class OOPS {

    public static void main(String[] args) {
        Pen p1 = new Pen();

        p1.setColor("Blue");
        System.out.println(p1.color);

        p1.setTip(6);
        System.out.println(p1.tip);

        // Fish shark = new Fish();

        // shark.eat();
        // shark.breath();

        // Calculator cal = new Calculator();

        // System.out.println(cal.Sum(3, 5));
        // System.out.println(cal.Sum((float) 3.5, (float) 5.5));
        // System.out.println(cal.Sum(4, 5, 6));

        // Dear hari = new Dear();

        // hari.eat();

        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();

        c.eat();
        c.walk();

    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int math, int chem) {
        percentage = (phy + math + chem) / 3;
    }
}

// class Animals {
// String color;

// void eat() {
// System.out.println("eats");
// }

// void breath() {
// System.out.println("breathes");
// }
// }

// class Fish extends Animals {
// int wins;

// void swime() {
// System.out.println("swime in water");
// }
// }

// Methods OverLoading

// class Calculator {
// int Sum(int x, int y) {
// return x + y;
// }

// float Sum(float x, float y) {
// return x + y;
// }

// int Sum(int x, int y, int z) {
// return x + y + z;
// }
// }

// Method OverRinding

// class Animals {
// void eat() {
// System.out.println("Eat Anythings");
// }
// }

// class Dear extends Animals {
// void eat() {
// System.out.println("Eat Grass");
// }
// }

// Abstract Classes

abstract class Animal {
    void eat() {
        System.out.println("Animals eat");
    }

    abstract void walk();
}

class Horse extends Animal {
    void walk() {
        System.out.println("Horse walk on 4 legs");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Chicken walk on 2 legs");
    }
}
