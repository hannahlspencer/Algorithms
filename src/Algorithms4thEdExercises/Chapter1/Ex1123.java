package Algorithms4thEdExercises.Chapter1;

public class Ex1123 {

    // 1.1.23 Add to the BinarySearch test client the ability to respond to a second argument:
    // + to print numbers from standard input that are not in the whitelist,
    // - to print numbers that are in the whitelist.

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(rank(5, a, '-'));
    }
    public static int rank(int key, int[] a, char printType)
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
