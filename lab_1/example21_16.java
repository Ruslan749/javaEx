package lab_1;

import java.util.Scanner;

public class example21_16 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("number a:");
            int a = in.nextInt();
            int b = --a;
            int c = ++a;
            int sum = a + b + c;
            double pow = Math.pow(a,c);
            System.out.printf("a: %s \nb: %s \nc: %s \npow: %s \n ", a, b, c, pow);
    }
}
