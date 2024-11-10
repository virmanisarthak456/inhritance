package Inheritance;

/**
 * A
 */
final class A { // final classes can not have a sub class

    public void show() {
        System.out.println("Show of class A");
    }

}

/**
 * B
 */
class B { 

    final public void show() {
        System.out.println("Show of classs B");
    }

}

/**
 * C
 */
class C extends B {

    // public void show() { // Method overriding is not allowed for final methods
    //     System.out.println("Show of classs B");
    // }
    
}




public class finalKeyword {
    public static void main(String[] args) {
        // Learning about the final keyword
        final int a = 8;
         // a = 9; can not change the value of final data types

         B obj = new C();
         obj.show();


    }
}
