package lab_1;

import java.util.Scanner;

public class exe13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("число a:");
        int a = in.nextInt();
        System.out.print("число b:");
        int b = in.nextInt();
        double pow  = Math.pow(a,b);
        System.out.printf("полученное число: %s", pow);
    }
}
