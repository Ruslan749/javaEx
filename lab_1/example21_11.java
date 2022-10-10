package lab_1;

import java.util.Scanner;

public class example21_11 {
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
