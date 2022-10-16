package lab_2;
import java.util.Scanner;

public class example21_01 {
    public static void main(String[] args) {
        example21_01.result(args);

    }

    public static void result(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("number:");
        int number = in.nextInt();

        if(number%3 == 0) {
            System.out.printf("число делиться на %s",3);
        } else
        {
            System.out.printf("число неделиться на %s",3);
        }
    }
}
