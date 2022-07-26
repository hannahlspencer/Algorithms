package Algorithms4thEdExercises.Chapter1;

import java.text.DecimalFormat;

public class Ex1121 {
    // 1.1.21 Write a program that reads in lines from standard input with each line containing
    // a name and two integers and then uses printf() to print a table with a column of the names,
    // the integers, and the result of dividing the first by the second, accurate to three decimal places.
    // You could use a program like this to tabulate batting averages for baseball players or grades for students.


    public static void main(String[] args) {
        printColumn("Name", 1, 8);
    }
    private static void printColumn(String name, int a, int b) {
        DecimalFormat df = new DecimalFormat("#.000");
        double number = Double.parseDouble(df.format((double) a / b));

        System.out.printf("%s  %s  %s  %s", name, a, b, number);
    }
}
