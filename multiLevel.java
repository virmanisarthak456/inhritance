package Inheritance;

/**
 * A
 */
class A {

    public A() {
        System.out.println("IN A");
    }

    public A(int n) {
        System.out.println("IN A int");
    }

}

/**
 * B
 */
class B extends A {

    B() {
        // there is always a super();
        // This will call the default constructor of super class
        this(6); // this() will call the paramertised constructor of the same class
        System.out.println("In B");
    }

    B(int n) {
        // This will call the parameterised constructor of the super class
        super(5);
        System.out.println("IN B int");
    }
}

public class multiLevel {
    public static void main(String[] args) {
        B obj = new B();
    }

}
