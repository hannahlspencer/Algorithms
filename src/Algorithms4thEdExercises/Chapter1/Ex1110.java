package Algorithms4thEdExercises.Chapter1;

public class Ex1110 {
    // 1.1.10 What is wrong with the following code fragment?
//       public void fragment() {
//           int[] a;
//           for (int i = 0; i < 10; i++)
//               a[i] = i * i;
//       }

    // It does not allocate memory for a[] with new. This code results in a
    // variable a might not have been initialized compile-time error.
}
