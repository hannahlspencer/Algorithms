package Algorithms4thEdExercises.Chapter1;

public class Ex1101and1102 {
    //1.1.1
    //Give the value of each of the following expressions:
    public static void ex111() {
        System.out.println((0 + 15) / 2);                   // 7
        System.out.println(2.0e-6 * 100000000.1);           //200.0000002
        System.out.println(true && false || true && true);  // true
    }

    //1.1.2
    //Give the type and value of each of the following expressions:
    public static void ex112() {
        System.out.println((1 + 2.236)/2);      //1.618, double
        System.out.println(1 + 2 + 3 + 4.0);    //10.0, double
        System.out.println(4.1 >= 4);           //true, boolean
        System.out.println(1 + 2 + "3");        //33, String
    }

    public static void main(String[] args) {
        ex111();
        ex112();
    }
}