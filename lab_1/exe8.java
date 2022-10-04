package lab_1;
//Напишите программу для вычисления суммы двух чисел. Оба числа
//        вводятся пользователем. Для вычисления суммы используйте оператор +.


import java.util.Scanner;

public class exe8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("number a:");
        int a = in.nextInt();
        System.out.print("number b:");
        int b = in.nextInt();
        System.out.printf("Sum: %s",  a+b);
    }
}
