package lab_1;


import java.util.Scanner;

public class example21_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Name:");
        String name = in.nextLine();
        System.out.print("Age:");
        int age = in.nextInt();
        System.out.printf("Ваше имя: %s ваш возраст: %s", name, 2022 - age);
    }
}
