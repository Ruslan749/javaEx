package lab_1;

import java.util.Scanner;

//          Напишите программу, в которой пользователю предлагается ввести
//        название месяца и количество дней в этом месяце. Программа выводит
//        сообщение о том, что соответствующий месяц содержит указанное количество
//        дней.

public class exe4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Name month:");
        String nameMonth = in.nextLine();
        System.out.print("Amount of days:");
        int amountOfDays = in.nextInt();


        System.out.printf("Месяц -%s , количество в нем дней - %s", nameMonth,amountOfDays);
        in.close();
    }
}
