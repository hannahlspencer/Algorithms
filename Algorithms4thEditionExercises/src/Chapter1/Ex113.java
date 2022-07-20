package Chapter1;

import java.util.Scanner;

public class Ex113 {
    //1.1.3 Write a program that takes three integer command-line arguments and
    // prints equal if all three are equal, and not equal otherwise.

    public static void main(String[] args) {
        int a = getInteger();
        int b = getInteger();
        int c = getInteger();
        areEqual(a, b, c);

    }

    public static int getInteger() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an integer");
        return keyboard.nextInt();
    }

    public static void areEqual(int a, int b, int c) {
        if(a == b && b == c) {
            System.out.print("Equal");
        } else {
            System.out.print("Not equal");
        }
    }
}
