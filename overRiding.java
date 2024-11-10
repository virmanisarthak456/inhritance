package Inheritance;

/**
 * A
 */
class A {

    public static void show() {
        System.out.println("Show A");
    }

    public static void show1() {
        System.out.println("Show1 A");
    }

}

/**
 * B
 */
class B extends A {
    public static void show() { // method over riding
        System.out.println("Show B");
    }

}

public class overRiding {

    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.show1();
    }

}
