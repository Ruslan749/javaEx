package lab_1;

import java.util.Scanner;

public class exe11 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("число a: ");
        int a = in.nextInt();
        System.out.print("число b: ");
        int b = in.nextInt();
        long area = Math.round(Math.E * (b*Math.l));
        System.out.printf("Гипатинуза равна: %s", area);
    }
}
