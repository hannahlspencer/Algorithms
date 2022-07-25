package Algorithms4thEdExercises.Chapter1;

public class Ex1109 {
    //1.1.9 Write a code fragment that puts the binary representation of a positive integer N
    //into a String s.

    public static void main(String[] args) {
        System.out.println(integerToBinary(5));
    }

    public static String integerToBinary(int num) {
        String s = "";
        for (int n = num; n > 0; n /= 2)
            s = (n % 2) + s;
        return s;
    }

}
