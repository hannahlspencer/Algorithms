package Algorithms4thEdExercises.Chapter1;

public class Ex1115 {

    // 1.1.15 Write a static method histogram() that takes an array a[] of int values and an
    // integer M as arguments and returns an array of length M whose ith entry is the number
    // of times the integer i appeared in the argument array.

    // If the values in a[] are all between 0 and M–1, the sum of the values in the returned array
    // should be equal to a.length.

    public static void main(String[] args) {
        int[] a = {1, 7, 3};
        int[] result = histogram(a, 4);
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] histogram(int[] a, int m) {
        int[] result = new int[m];

        for(int i = 0; i < a.length; i++) {
            if(a[i] < m) {
                result[a[i]]++;
            }
        }
        return result;
    }
}
