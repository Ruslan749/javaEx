package lab_1;

import java.util.Scanner;

public class example21_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("number a:");
        int a = in.nextInt();
        System.out.print("number b:");
        int b = in.nextInt();

        int c = a + b;
        int e = a - b;
        System.out.printf("сумму: %s\nразность: %s\n", c, e);
    }
}
