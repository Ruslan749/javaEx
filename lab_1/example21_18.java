package lab_1;

import java.util.Scanner;

public class example21_18 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("число a: ");
        int a = in.nextInt();
        System.out.print("число b: ");
        int b = in.nextInt();
        long area = Math.round(Math.E * (b*Math.log(a)));
        System.out.printf("Гипатинуза равна: %s", area);
    }
}
