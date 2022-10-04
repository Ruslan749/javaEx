package lab_1;

import java.util.Scanner;

//        Напишите программу, в которой Пользователь вводит два числа, а
//        программой вычисляется и отображается сумма и разность этих чисел.

public class exe10 {
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
