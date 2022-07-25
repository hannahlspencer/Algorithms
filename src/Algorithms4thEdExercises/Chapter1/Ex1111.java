package Algorithms4thEdExercises.Chapter1;

public class Ex1111 {
    // 1.1.11 Write a code fragment that prints the contents of a two-dimensional boolean array,
    // using * to represent true and a space to represent false. Include row and column numbers.

    public static void main(String[] args) {
        boolean[][] arr = new boolean[3][4];
        arr[0][0] = true;
        arr[0][1] = false;
        arr[0][2] = true;
        arr[0][3] = true;
        arr[1][0] = true;
        arr[1][1] = false;
        arr[1][2] = true;
        arr[1][3] = true;
        arr[2][0] = true;
        arr[2][1] = false;
        arr[2][2] = true;
        arr[2][3] = false;
        print2DBooleanArr(arr);
    }

    public static void print2DBooleanArr(boolean[][] arr) {
        System.out.print(" ");
        for(int k = 0; k < arr[0].length; k++) {
            System.out.print(k);
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println();
            System.out.print(i);

            for(int j = 0; j < arr[i].length; j++) {
               System.out.print(arr[i][j] ? '*' : ' ');
            }
        }
    }
}
