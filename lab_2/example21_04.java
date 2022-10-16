package lab_2;
import java.util.Scanner;

public class example21_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("number:");
        int number = in.nextInt();

        if (number >= 5 && number <= 10){
            System.out.println("попадает в диапзон значений от 5 до 10");
        }else {
            System.out.println("непопадает в диапзон значений");
        }
    }
}
