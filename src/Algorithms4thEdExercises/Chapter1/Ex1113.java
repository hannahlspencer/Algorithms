package Algorithms4thEdExercises.Chapter1;

public class Ex1113 {
    // 1.1.13 Write a code fragment to print the transposition (rows and columns changed)
    // of a two-dimensional array with M rows and N columns.


    public static void main(String[] args) {
        int[][] x = new int[2][2];
        x[0][0] = 1;
        x[0][1] = 2;
        x[1][0] = 5;
        x[1][1] = 3;

        transpose(x);
    }
    private static void transpose(int[][] arr) {
        int[][] newArr = new int[arr[0].length][arr.length];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                newArr[i][j] = arr[i][j];
            }

        }
        for (int[] ints : newArr) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print(anInt);
            }
        }

    }
}

