package Algorithms4thEdExercises.Chapter1;

public class Ex1119 {

    // 1.1.19 Run the following program on your computer:

        public static long F(int N) {
            if (N == 0) return 0;
            if (N == 1) return 1;
            return F(N-1) + F(N-2);
        }

        private static int fasterF(int n, int[] arr) {
            if (n == 0) return arr[0];
            if (n == 1) return arr[1];

            for (int i = 2; i <= n; i++) {
                arr[i] = arr[i-2] + arr[i-1];
            }

            return arr[n];
        }
        public static void main(String[] args) {
            for (int N = 0; N < 100; N++)
                System.out.println(N + " " + F(N));
        }
}

    // What is the largest value of N for which this program takes less 1 hour to compute
    // the value of F(N)? Develop a better implementation of F(N) that saves computed values in an array.

    // The largest value of N that takes less than 1 hour to compute is 51.
