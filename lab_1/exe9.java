package lab_1;

import java.util.Scanner;

//Напишите программу, в которой пользователь вводит число, а программой
//        отображается последовательность из четырех чисел: число, на единицу
//        меньше введённого, введенное число и число, на единицу больше введенного.
//        Четвертое число должно быть квадратом суммы первых трех чисел.
public class exe9 {
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
