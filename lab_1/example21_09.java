package lab_1;

import java.util.Scanner;

public class example21_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("name:");
        String name = in.nextLine();
        System.out.print("age:");
        int age = in.nextInt();
        System.out.printf("Hello: "+ name + ' ' + age);
        in.close();
    }
}
