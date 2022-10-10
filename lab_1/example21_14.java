package lab_1;

import java.util.Scanner;

public class example21_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Age:");
        int age = in.nextInt();
        System.out.printf("Ваша дата рождения: %s",  2022 - age);
    }
}
