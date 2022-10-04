package lab_1;

//         Напишите программу, в которой Пользователь вводит имя и год рождения,
//        в программа отображает сообщение содержащее имя пользователя и его
//        возраст.

import java.util.Scanner;

public class exe6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Name:");
        String name = in.nextLine();
        System.out.print("Age:");
        int age = in.nextInt();
        System.out.printf("Ваше имя: %s ваш возраст: %s", name, 2022 - age);
    }
}
