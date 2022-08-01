package Algorithms4thEdExercises.Chapter1;

public class Ex1122 {
    // 1.1.22 Write a version of Binary Search that uses the recursive rank() given on page 25 and traces the method
    // calls. Each time the recursive method is called, print the argument values lo and hi, indented by the
    // depth of the recursion. Hint: Add an argument to the recursive method that keeps track of the depth.

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(rank(5, a));
    }
    public static int rank(int key, int[] a)
    {  return rank(key, a, 0, a.length - 1, 1);  }
    public static int rank(int key, int[] a, int lo, int hi, int depth) {
        StringBuilder indentation = new StringBuilder();
        indentation.append(" ".repeat(depth + 1));

        System.out.println(indentation + "Lo: " + lo);
        System.out.println(indentation + "Hi: " + hi);

        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if      (key < a[mid]) return rank(key, a, lo, mid - 1, depth + 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi, depth + 1);
        else                   return mid;
    }
}
