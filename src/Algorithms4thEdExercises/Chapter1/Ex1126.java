package Algorithms4thEdExercises.Chapter1;

public class Ex1126 {
    // 1.1.26 Sorting three numbers. Suppose that the variables a, b, c, and t are all of the same numeric primitive type. Show that the following code puts a, b, and c in ascending order:
    //    if (a > b) { t = a; a = b; b = t; }
    //    if (a > c) { t = a; a = c; c = t; }
    //    if (b > c) { t = b; b = c; c = t; }

    public static void main(String[] args) {
        sort(1, 4, 2);

    }

    public static void sort(int a, int b, int c) {
        System.out.println("Before - a: " + a + ", b: " + b + ", c: " + c);
        int t;
        if (a > b) { t = a; a = b; b = t; }
        if (a > c) { t = a; a = c; c = t; }
        if (b > c) { t = b; b = c; c = t; }
        System.out.println("After - a: " + a + ", b: " + b + ", c: " + c);
    }


}
