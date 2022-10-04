package lab_1;
//Напишите программу, в которой по возрасту определяется год рождения

import java.util.Scanner;

public class exe7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Age:");
        int age = in.nextInt();
        System.out.printf("Ваша дата рождения: %s",  2022 - age);
    }
}
