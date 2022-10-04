package lab_1;

//        Напишите программу, в которой пользователю предлагается ввести
//        название месяца и количество дней в этом месяце. Программа выводит
//        сообщение о том, что соответствующий месяц содержит указанное количество
//        дней.

import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Age:");
        int age = in.nextInt();
        System.out.printf("ваш возраст : %s", 2022 - age);
    }
}
