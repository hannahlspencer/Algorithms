package Algorithms4thEdExercises.Chapter1;

import static java.lang.Math.ceil;
import static java.lang.Math.round;

public class Ex1114 {

    // 1.1.14 Write a static method lg() that takes an int value N as argument and returns the largest int
    // not larger than the base-2 logarithm of N. Do not use Math.

    public static void main(String[] args) {
        System.out.println(ceil(Math.log(25)));
        System.out.println(lg(25));
    }
    private static int lg(int n) {
        int logInt = 0;

        while (n > 0) {
            logInt++;
            n /= 2;
        }
        return logInt - 1;
    }
}
