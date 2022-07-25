package Algorithms4thEdExercises.Chapter1;

public class Ex1105 {
    // 1.1.5 Write a code fragment that prints true if the double variables
    // x and y are both strictly between 0 and 1 and false otherwise.

    public static void main(String[] args) {
        double x = 0.0000001;
        double y = 0.3;
        System.out.print(between0and1(x) && between0and1(y));
    }

    public static boolean between0and1(double z) {
        return z < 1.0 && z > 0.0;
    }
}
